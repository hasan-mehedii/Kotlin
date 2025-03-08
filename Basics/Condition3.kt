fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    val day = 2
    
	// Like Switch in C and C++
	val result = when (day) {
  		1 -> "Monday"
  		2 -> "Tuesday"
  		3 -> "Wednesday"
  		4 -> "Thursday"
  		5 -> "Friday"
  		6 -> "Saturday"
  		7 -> "Sunday"
  		else -> "Invalid day."
	}
	println(result)
}
