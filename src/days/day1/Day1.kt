package days.day1

import java.io.File

fun main() {
    val day1 = Day1()
    day1.analyzeFile("src/days/day1/input")
}

class Day1 {
    fun hasIncreased(value: Int, previousValue: Int): Boolean {
        return value > previousValue
    }

    fun analyzeFile(fileName: String) {
        val lines = File(fileName).readLines()
        val numberOfIncreases = calculateNumberOfIncreases(lines)
        println("Number of increases is $numberOfIncreases")
    }

    fun calculateNumberOfIncreases(lines: List<String>): Int {
        if (lines.isEmpty()) {
            return 0
        }
        var previousValue = lines[0].toInt()
        var numberOfIncreases = 0
        for (line in lines.subList(1, lines.size)) {
            val currentValue = line.toInt()
            if (hasIncreased(currentValue, previousValue)) {
                numberOfIncreases++
            }
            previousValue = currentValue
        }
        return numberOfIncreases
    }

}