fun main() {
    print("Enter a decimal number: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0

    println("You entered: $num")
}
