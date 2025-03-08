import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter your roll number: ")
    val roll = scanner.nextInt()

    print("Enter your name: ")
    val name = scanner.next()

    println("Roll: $roll, Name: $name")
}
