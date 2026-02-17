// Basic function (returns nothing)
fun sayHello() {
    println("Hello!")
}

// Function with return value
fun greet(): String {
    return "Good Morning"
}

// Function with parameter
fun greetPerson(name: String): String {
    return "Hello, $name"
}

// Function with multiple parameters
fun introduce(name: String, age: Int): String {
    return "My name is $name and I am $age years old."
}

// Function with default argument
fun greetWithDefault(name: String = "Rover"): String {
    return "Hello, $name"
}

// Single expression function
fun add(a: Int, b: Int): Int = a + b

fun main() {

    // 1. Call basic function
    sayHello()

    // 2. Call function that returns value
    println(greet())

    // 3. Call function with parameter
    println(greetPerson("Ali"))

    // 4. Call function with multiple parameters
    println(introduce("Sara", 21))

    // 5. Named arguments
    println(introduce(age = 25, name = "Zaid"))

    // 6. Default argument
    println(greetWithDefault())
    println(greetWithDefault("Ayaan"))

    // 7. Single expression function
    println("Sum: ${add(5, 3)}")
}
