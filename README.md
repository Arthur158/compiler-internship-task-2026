# MiniKotlin to Java CPS Compiler
# MiniKotlin to Java CPS Compiler

This is an internship assignment for implementing a CPS-style (Continuation-Passing Style) compiler from MiniKotlin (a subset of Kotlin) to Java.

## Overview

The goal is to implement a compiler that translates MiniKotlin source code into Java, where all functions are expressed using continuation-passing style.

## Project Structure

- `samples/` - Example MiniKotlin programs
- `src/main/antlr/MiniKotlin.g4` - Grammar definition for MiniKotlin
- `src/main/kotlin/compiler/` - Compiler implementation
- `src/test/` - Testing framework
- `stdlib/` - Standard library with `Prelude` class containing CPS function examples

## Task

Implement the `MiniKotlinCompiler` to translate MiniKotlin to Java such that:

1. All functions use continuation-passing style
2. The semantics of operators follows Kotlin 

See `Prelude` in the stdlib for examples of how CPS functions should look.

## Example

Suppose that the MiniKotlin code looks like this:
```kotlin
fun factorial(n: Int): Int {
    if (n <= 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

// Main logic
fun main(): Unit {
    val result: Int = factorial(5)
    println(result)

    // Arithmetic and logical expressions
    val a: Int = 10 + 5
    val b: Boolean = a > 10
    println(a)
}
```

Then the supposed implementation can look like this: 
```java
public static void factorial(Integer n, Continuation<Integer> __continuation) { 
  if ((n <= 1)) {
    __continuation.accept(1);
    return;
  }
  else {
    factorial((n - 1), (arg0) -> {
      __continuation.accept((n * arg0));
      return;
      });
    }
}

public static void main(String[] args) { 
  factorial(5, (arg0) -> {
    Integer result = arg0;
    Prelude.println(result, (arg1) -> {
      Integer a = (10 + 5);
      Boolean b = (a > 10);
      Prelude.println(a, (arg2) -> {
      });
    });
  });
}
```


## Building and Running

```bash
# Build the project
./gradlew build

# Run with default example
./gradlew run

# Run with a specific file
./gradlew run --args="samples/example.mini"

# Run tests
./gradlew test
```

## Evaluation

The task will be tested on a hidden set of tests.
