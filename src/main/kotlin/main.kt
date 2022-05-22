fun main() {

    val list = listOf('a', 'a', 'b')

    println("${perc(list)} %")

}

fun perc(list: List<Char>): Double {

    val percentage = 100
    val itemCount = list.count()
    println("Item $itemCount")
    val aCountInList = list.count { it == 'a' }
    println("ACount $aCountInList")
    val total = (aCountInList.toDouble() / itemCount.toDouble()) * percentage.toDouble()
    println("total $total")
    return total
}

