fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    // While Loop
    var i = 0
    while(i<10){
        println("$i Mehedi")
        if(i==3) break
        i++
    }
    
    // Do While Loop
    var j = 0
    do{
        if(j == 3){
            j++
            continue
        }
        
        println("$j Hasan")
        j++
    }while(j<10)
}
