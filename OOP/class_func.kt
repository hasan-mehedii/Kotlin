class Student(val roll: Int, val name: String){
    //class functions
    fun talk(){
        println("$name is Talking")
    }
    
    fun subject(Sub: String){
        println("$Sub is my favourite")
    }
}

fun main() {
    val S1 = Student(1, "Mehedi")

    println(S1.roll)
    println(S1.name)
    println("We have got Roll: ${S1.roll} with ${S1.name}")
    
    S1.talk()
    S1.subject("Physics")
}
