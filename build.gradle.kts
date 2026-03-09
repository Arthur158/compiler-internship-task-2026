plugins {
    kotlin("jvm") version "2.3.0"
    antlr
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("org.example.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.1")
    implementation("org.antlr:antlr4-runtime:4.13.1")
    implementation(project(":stdlib"))
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        showStandardStreams = true
    }
}

tasks.generateGrammarSource {
    arguments = arguments + listOf("-visitor", "-listener")
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.compileTestKotlin {
    dependsOn(tasks.generateTestGrammarSource)
}

val copyStdlibJar by tasks.registering(Copy::class) {
    dependsOn(":stdlib:jar")
    from(project(":stdlib").tasks.named("jar"))
    into(layout.buildDirectory.dir("stdlib"))
}

tasks.named("classes") {
    dependsOn(copyStdlibJar)
}
