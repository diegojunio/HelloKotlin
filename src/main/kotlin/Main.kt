import java.util.*

fun main(Args: Array<String>){
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food.")
}

fun randomDay() : String {
    val week = arrayOf(
        "Monday", "Tuesday",
        "Wednesday", "Thursday",
        "Friday","Saturday",
        "Sunday")

    return week[Random().nextInt(week.size)]
}

fun fishFood (day: String) : String  {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}