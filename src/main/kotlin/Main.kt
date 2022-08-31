fun main() {
    val likes = 1_101_342
    val str = if (likes % 10 == 1 && likes > 20) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $str")
}