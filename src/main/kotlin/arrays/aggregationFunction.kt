fun aggregationsFunctions() {
    val ages: IntArray = intArrayOf(12, 17, 18, 24, 35, 46, 64)
    val olderAge = ages.max()
    println("Older age: $olderAge")

    val underage = ages.min()
    println("Underage: $underage")

    val average: Double = ages.average()
    println("Average: $average")

    val allBigger = ages.all { it >= 18}
    println("All bigger? $allBigger")

    val someAdult = ages.any { it >= 18}
    println("Some adult? $someAdult")

    val adults = ages.filter { it >= 18}
    println("Adults $adults")

    val quest = ages.find { it == 18}
    println("quest $quest")
}