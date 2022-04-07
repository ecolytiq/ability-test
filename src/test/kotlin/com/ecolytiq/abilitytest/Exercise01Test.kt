package com.ecolytiq.abilitytest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Exercise01Test {

    val clazzUnderTest = Exercise01()

    @Test
    fun findAllPairs_test01() {

        val numbers = listOf(8, 7, 2, 5, 3, 1)
        val sum = 10

        val expected = listOf(Pair(first = 8, second = 2), Pair(first = 7, second = 3))

        val actual = clazzUnderTest.findAllPairs(numbers = numbers, sum = sum)
        assertThat(actual).isNotEmpty
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun findAllPairs_test02() {

        val numbers = listOf(8, 7, 2, 5, 3, 1)
        val sum = 16

        val actual = clazzUnderTest.findAllPairs(numbers = numbers, sum = sum)
        assertThat(actual).isEmpty()
    }

    @Test
    fun findAllPairs_test03() {

        val numbers = listOf(8, 7, 2, 5, 3, 1, 8, 7, 2, 5, 3, 1)
        val sum = 10

        val expected = listOf(
            Pair(first = 8, second = 2),
            Pair(first = 7, second = 3),
            Pair(first = 2, second = 8),
            Pair(first = 3, second = 7),
            Pair(first = 8, second = 2),
            Pair(first = 5, second = 5),
            Pair(first = 7, second = 3)
        )

        val actual = clazzUnderTest.findAllPairs(numbers = numbers, sum = sum)
        assertThat(actual).isNotEmpty
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun findAllUniquePairs_test01() {

        val numbers = listOf(8, 7, 2, 5, 3, 1, 8, 7, 2, 5, 3, 1)
        val sum = 10

        val expected = listOf(
            Pair(first = 2, second = 8),
            Pair(first = 3, second = 7),
            Pair(first = 5, second = 5)
        )

        val actual = clazzUnderTest.findAllUniquePairs(numbers = numbers, sum = sum)
        assertThat(actual).isNotEmpty
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun findAllUniquePairs_test02() {

        val numbers = listOf(8, 7, 2, 5, 3, 1, 8, 7, 2, 5, 3, 1)
        val sum = 14

        val expected = listOf(
            Pair(first = 7, second = 7)
        )

        val actual = clazzUnderTest.findAllUniquePairs(numbers = numbers, sum = sum)
        assertThat(actual).isNotEmpty
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun findAllUniquePairs_test03() {

        val numbers = listOf(8)
        val sum = 14

        val actual = clazzUnderTest.findAllUniquePairs(numbers = numbers, sum = sum)
        assertThat(actual).isEmpty()
    }
}
