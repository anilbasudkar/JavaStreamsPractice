package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddOrEvenNumbersTest {
    SumOfOddOrEvenNumbers sumOfOddOrEvenNumbers = new SumOfOddOrEvenNumbers();
    @Test
    void sumOfNumbers() {
        List<Integer> integerList  = List.of(1,3,4,5,6,7,8,9,10);
        Assertions.assertEquals(28,
        sumOfOddOrEvenNumbers.sumOfNumbers(integerList, Boolean.TRUE));

    }
}