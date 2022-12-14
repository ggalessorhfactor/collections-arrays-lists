fun aggregationsFunctions() {
    val ages: IntArray = intArrayOf(12, 17, 18, 24, 35, 46, 64)
    val older = ages.max()
    println("Older: $older")

    val newest = ages.min()
    println("Newest: $newest ")

    val average: Double = ages.average()
    println("Average: $average")

    val allAdults = ages.all { it >= 18}
    println("All are adults? $allAdults")

    val someAdult = ages.any { it >= 18}
    println("Some adult? $someAdult")

    val adults = ages.filter { it >= 18}
    println("Adults $adults")

    val quest = ages.find { it == 18}
    println("quest $quest")
}