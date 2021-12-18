package days.day1Part2

import days.day1Part2.Day1Part2
import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

internal class Day1Part2Test {

    @Test
    fun testThatHasIncreasedReturnsTrueIfValueIfBiggerThanPreviousValue() {
        val day1 = Day1Part2()

        val result = day1.hasIncreased(listOf(1,2,3), listOf(1,1,1))

        assertThat(result).isTrue
    }

    @Test
    fun testThatHasIncreasedReturnsFalseIfValueIfSmallerThanPreviousValue() {
        val day1 = Day1Part2()

        val result = day1.hasIncreased(listOf(1,2,3), listOf(1,1,5))

        assertThat(result).isFalse
    }

    @Test
    fun testThatHasIncreasedReturnsFalseIfValueIfEqualToPreviousValue() {
        val day1 = Day1Part2()

        val result = day1.hasIncreased(listOf(1,2,3), listOf(1,2,3))

        assertThat(result).isFalse
    }

    @Test
    fun testThatCalculateNumberOfIncreasesReturnsZeroIfNoLineIsGiven() {
        val day1 = Day1Part2()
        val numberOfIncreases = day1.calculateNumberOfIncreases(emptyList())

        assertThat(numberOfIncreases).isEqualTo(0);
    }

    @Test
    fun testThatCalculateNumberOfIncreasesCountsNumberOfIncreases() {
        val lines = listOf("1", "1", "2", "2", "3", "1", "3", "1");
        val day1 = Day1Part2();

        val numberOfIncreases = day1.calculateNumberOfIncreases(lines);

        assertThat(numberOfIncreases).isEqualTo(3);
    }
}