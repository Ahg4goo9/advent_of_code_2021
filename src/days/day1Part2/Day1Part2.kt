package days.day1Part2

import java.io.File

fun main() {
    val day1 = Day1Part2()
    day1.analyzeFile("src/days/day1Part2/input")
}

class Day1Part2 {
    fun hasIncreased(currentValues: List<Int>, previousValues: List<Int>): Boolean {
        return currentValues.sum() > previousValues.sum();
    }

    fun analyzeFile(fileName: String) {
        val lines = File(fileName).readLines()
        val numberOfIncreases = calculateNumberOfIncreases(lines)
        println("Number of increases is $numberOfIncreases")
    }

    fun calculateNumberOfIncreases(lines: List<String>): Int {
        if (lines.size < 3) {
            return 0
        }
        var previousValues = lines.subList(0, 3).map { it.toInt() }
        var numberOfIncreases = 0
        for (index in 1..lines.size - 3) {
            val currentValues = lines.subList(index, index + 3).map { it.toInt() }
            println("previous: $previousValues")
            println("current: $currentValues")
            if (hasIncreased(currentValues, previousValues)) {
                numberOfIncreases++
            }
            previousValues = currentValues
        }
        return numberOfIncreases
    }

}