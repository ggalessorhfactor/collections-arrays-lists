fun testAges() {
    val ages: IntArray = intArrayOf(18, 25, 31, 27, 63, 46)

    var older = Int.MIN_VALUE
    for (age in ages) {
        if (age > older) {
            older = age
        }
    }

    println(older)

    var newest = Int.MAX_VALUE
    ages.forEach { age ->
        if (age < newest) {
            newest = age
        }
    }
    println(newest)
}