fun main(){
  callme()
  // val greeting = birthdayGreeting()
  val greeting = birthdayGreeting("Mehedi", 5)
  println(greeting)
}

// default return type is unit. It will not create any problem if we don't mention that.

// fun callme(): Unit{
// fun callme(){
//   println("I am in callme function")
// }

// fun birthdayGreeting(): String {
//     val nameGreeting = "Happy Birthday, Rover!"
//     val ageGreeting = "You are now 5 years old!"
//     return "$nameGreeting\n$ageGreeting"
// }

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
