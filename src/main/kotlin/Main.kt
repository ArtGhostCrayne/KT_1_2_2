fun main() {
    val likes = 121
    val str = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }

    println("Понравилось $likes $str")
}