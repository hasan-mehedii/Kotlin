fun main() {
    print("Enter your roll number: ")
    val roll = readLine()?.toIntOrNull() ?: 0  // Converts to Int and handles null

    println("Your roll number is $roll")
}
