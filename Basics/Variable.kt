// val variable_name: Data_type = Initial value
// val keyword - Use when you expect the variable value will not change.
// var keyword - Use when you expect the variable value can change.

fun main() {
    
    val count: Int = 2
    val name: String = "Messi"
    val salary: Double = 540.50
    
    val name = "Messi"
    val salary = 540.50
    var age = 90
    
    println(name + " Has a salary of "+ salary +"$")
    println("$name has a salary of $salary$")        //both will print same line

    println(age)
    age = 100
    println(age)

    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
}
