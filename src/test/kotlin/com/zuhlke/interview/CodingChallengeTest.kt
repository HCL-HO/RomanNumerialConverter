package com.zuhlke.interview

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CodingChallengeTest {

    @Test
    fun findAtomIndexFromRN_returnLargestNumberIndex() {
        val exampleRN = "VII"
        val result = CodingChallenge.findAtomIndexFromRN(exampleRN)
        val expectedResult = 0
        Assertions.assertEquals(result, expectedResult)
    }

    @Test
    fun getNumberFromRomanNumerial_bigNumAtTheStart_returnCorrectNumber() {
        val exampleRN = "LVIII"
        val result = CodingChallenge.getNumberFromRomanNumerial(exampleRN)
        val expectedResult = 58
        Assertions.assertEquals(result, expectedResult)
    }

    @Test
    fun getNumberFromRomanNumerial_bigNumAtTheEnd_returnCorrectNumber() {
        val exampleRN = "IX"
        val result = CodingChallenge.getNumberFromRomanNumerial(exampleRN)
        val expectedResult = 9
        Assertions.assertEquals(result, expectedResult)
    }

    @Test
    fun getNumberFromRomanNumerial_bigNumAtTheMiddle_returnCorrectNumber() {
        val exampleRN = "XCIV"
        val result = CodingChallenge.getNumberFromRomanNumerial(exampleRN)
        val expectedResult = 94
        Assertions.assertEquals(result, expectedResult)
    }

    @Test
    fun getNumberFromRomanNumerial_MMMCDXLIV_returnCorrectNumber() {
        val exampleRN = "MMMCDXLIV"
        val result = CodingChallenge.getNumberFromRomanNumerial(exampleRN)
        val expectedResult = 3444
        Assertions.assertEquals(result, expectedResult)
    }


    @Test
    fun getNumberFromRomanNumerial_MMMCDLVI_returnCorrectNumber() {
        val exampleRN = "MMMCDLVI"
        val result = CodingChallenge.getNumberFromRomanNumerial(exampleRN)
        val expectedResult = 3456
        Assertions.assertEquals(result, expectedResult)
    }


    @Test
    fun getNumberFromRomanNumerial_XCIX_returnCorrectNumber() {
        val exampleRN = "XCIX"
        val result = CodingChallenge.getNumberFromRomanNumerial(exampleRN)
        val expectedResult = 99
        Assertions.assertEquals(result, expectedResult)
    }
}
