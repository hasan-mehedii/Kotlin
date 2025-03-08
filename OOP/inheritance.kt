open class Parent{
    val x = 10
}

class Child : Parent(){
    fun display(){
        println(x)
    }
}

fun main() {
    val S1 = Child()

    S1.display()
}

// Use the open keyword in front of the superclass/parent, to make this the class other classes should inherit properties and functions from.
// To inherit from a class, specify the name of the subclass, followed by a colon :, and then the name of the superclass
