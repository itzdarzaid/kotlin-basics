# Kotlin Notes 📘

These are my personal notes while learning Kotlin.

---

#  Day 1 – Introduction to Kotlin

## 🔹 What is Kotlin?

Kotlin is a modern programming language used to build Android apps.

It is:
- Simple
- Clean
- Less code than Java
- Easy for beginners

---

## 🔹 What is a Function?

A function is a block of code that does something.

We create a function using the keyword `fun`.

Example:

```kotlin
fun greet() {
    println("Hello")
}
```

Here:
- `fun` means function
- `greet` is the function name
- `{}` contains the code

---

## 🔹 What is `main()` Function?

`main()` is the starting point of a Kotlin program.

The program begins running from here.

Example:

```kotlin
fun main() {
    println("Hello Android!")
}
```

Without `main()`, the program will not run.

---

## 🔹 What is `println()`?

`println()` prints text to the console.

Example:

```kotlin
println("Hello")
```

Output:
Hello

It prints the text and moves to the next line.

---

## 🔹 Program Execution Order

Kotlin runs code from top to bottom inside `main()`.

Example:

```kotlin
fun main() {
    println("Line 1")
    println("Line 2")
}
```

Output:
- Line 1
- Line 2

---

## 🔹 Important Things I Learned Today

- Kotlin does NOT require semicolons `;`
- Code inside `{}` belongs to the function
- The program always starts from `main()`
- Each `println()` prints on a new line

---

# ✅ Day 1 Completed
