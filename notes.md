# Kotlin Notes 📘

These are my personal notes while learning Kotlin.

---
# ✅ Day 1

# Introduction to Kotlin

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

# 📅 Day 2 – Kotlin Variables

## 🔹 What is a Variable?

A variable is a container that stores a value.

Example:

```kotlin
val name = "Dar Zaid"
```

Here:
- `val` → keyword
- `name` → variable name
- `"Dar Zaid"` → stored value

---

## 🔹 val vs var

### ✅ val (Read-only)
- Value cannot change after assignment.
- Preferred by default.

Example:

```kotlin
val age = 22
// age = 23 ❌ Not allowed
```

---

### ✅ var (Mutable)
- Value can change later.

Example:

```kotlin
var age = 22
age = 23  // ✔ Allowed
```

---

## 🔹 Type Inference

Kotlin automatically detects type.

Example:

```kotlin
val number = 10   // Int
val price = 9.99  // Double
val name = "Zaid" // String
```

Explicit type (optional):

```kotlin
val number: Int = 10
```

---

## 🔹 Basic Data Types Used

- Int → Whole numbers
- Double → Decimal numbers
- String → Text
- Char → Single character
- Boolean → true / false

---

## 🔹 String Templates

Insert variables inside strings using `$`.

Example:

```kotlin
val name = "Zaid"
println("Hello $name")
```

Output:
Hello Zaid

For expressions:

```kotlin
println("Next year age: ${age + 1}")
```

---

## 🔹 Variable Naming Rules

- Cannot start with number
- No spaces
- Use camelCase
- Meaningful names preferred

Good examples:
- userName
- totalMarks
- isLoggedIn

---

## 🔹 What I Learned

- Use `val` whenever possible.
- Use `var` only when needed.
- Kotlin automatically detects type.
- `$variable` inserts value inside string.

---

# 📅 Day 3 – Functions & Return Values

## 🔹 What is a Function?

A function is a block of code that performs a specific task.

It helps:
- Avoid repeating code
- Organize logic
- Make programs cleaner

---

## 🔹 Basic Function Syntax

```kotlin
fun greet() {
    println("Hello!")
}
```

Here:
- `fun` → keyword to define function
- `greet` → function name
- `()` → parameters
- `{}` → function body

---

## 🔹 Calling a Function

To use a function, call it by its name.

```kotlin
fun main() {
    greet()
}
```

---

## 🔹 Function with Parameters

Functions can take input values.

```kotlin
fun greet(name: String) {
    println("Hello $name")
}
```

Calling it:

```kotlin
greet("Zaid")
```

---

## 🔹 Return Values

Some functions return a value using `return`.

Example:

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
```

Here:
- `: Int` → return type
- `return` → sends value back

Using it:

```kotlin
fun main() {
    val result = add(5, 3)
    println(result)
}
```

Output:
8

---

## 🔹 Single Expression Function

Short form:

```kotlin
fun add(a: Int, b: Int): Int = a + b
```

Cleaner and shorter.

---

## 🔹 What I Learned

- Functions organize code.
- Parameters allow input.
- `return` sends value back.
- Return type must match value.
