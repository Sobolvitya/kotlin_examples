fun main(args: Array<String>) {
    testList()
}

fun sum(a: Int, b : Int) :Int {
    return a + b
}

fun testList() {
    val listOfString : List<String?> = listOf("A", null)
    for (item in listOfString) {
        item?.let { println(it.length) }
    }
}

fun maxOf(a: Int, b: Int) :Int = if (a > b) a else b