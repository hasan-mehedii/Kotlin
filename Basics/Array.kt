fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    val man = arrayOf("Mehedi", "Hasan", "Messi")
    println(man[0])
    
    man[2] = "Ronaldo CR7"
    for(i in man){
        println(i)
    }
    
    println(man.size)
    
    if("Mehedii" in man){
        println("Caught!!")
    } else {
        println("Vagse")
    }
}
