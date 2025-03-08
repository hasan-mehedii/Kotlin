// class Student{
//     var roll = 0
//     var name = ""
// }

// fun main() {
    
//     val S1 = Student()

//     S1.roll = 1
//     S1.name = "Mehedi"

//     println("We have got Roll:${S1.roll} with Name:${S1.name}")
// }

class Student(val roll: Int, val name: String) //with constructor

fun main() {
    val S1 = Student(1, "Mehedi")

    println(S1.roll)
    println(S1.name)
    println("We have got Roll: ${S1.roll} with ${S1.name}")
}
