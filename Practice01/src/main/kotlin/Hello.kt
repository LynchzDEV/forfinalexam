import java.util.*

fun main(args: Array<String>){
//    println("Hello ${args[0]}")
//    drive()
//    drive("Slow")
//    drive(speed = "The flash!!")

    println(randomDay())
}

fun drive(speed  : String = "fast"){
    println("driving $speed")
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}