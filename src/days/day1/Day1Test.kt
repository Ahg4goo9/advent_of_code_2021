package days.day1

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

internal class Day1Test {

    @Test
    fun testThatHasIncreasedReturnsTrueIfValueIfBiggerThanPreviousValue() {
        val day1 = Day1()
        val result = day1.hasIncreased(15, 10)
        assertThat(result).isTrue
    }

    @Test
    fun testThatHasIncreasedReturnsFalseIfValueIfSmallerThanPreviousValue() {
        val day1 = Day1()
        val result = day1.hasIncreased(5, 10)
        assertThat(result).isFalse
    }

    @Test
    fun testThatHasIncreasedReturnsFalseIfValueIfEqualToPreviousValue() {
        val day1 = Day1()
        val result = day1.hasIncreased(5, 5)
        assertThat(result).isFalse
    }

    @Test
    fun testThatCalculateNumberOfIncreasesReturnsZeroIfNoLineIsGiven() {
        val day1 = Day1()
        val numberOfIncreases = day1.calculateNumberOfIncreases(emptyList())

        assertThat(numberOfIncreases).isEqualTo(0);
    }

    @Test
    fun testThatCalculateNumberOfIncreasesCountsNumberOfIncreases() {
        val lines = listOf("1", "1", "2", "2", "3", "1", "3");
        val day1 = Day1();

        val numberOfIncreases = day1.calculateNumberOfIncreases(lines);

        assertThat(numberOfIncreases).isEqualTo(3);
    }
}