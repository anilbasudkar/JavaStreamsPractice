package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNumberPositiveOrNegativeTest {

    CheckIfNumberPositiveOrNegative checkIfNumberPositiveOrNegative = new CheckIfNumberPositiveOrNegative();

    @Test
    void isTheNumberPositiveOrNegative_4() {
        Boolean expectedOutput = true;
        Assertions.assertEquals(expectedOutput, checkIfNumberPositiveOrNegative.isTheNumberPositiveOrNegative(4));
    }
    @Test
    void isTheNumberPositiveOrNegative_3() {
        Boolean expectedOutput = false;
        Assertions.assertEquals(expectedOutput, checkIfNumberPositiveOrNegative.isTheNumberPositiveOrNegative(-3));
    }
    @Test
    void isTheNumberPositiveOrNegative_0() {
        Boolean expectedOutput = true;
        Assertions.assertEquals(expectedOutput, checkIfNumberPositiveOrNegative.isTheNumberPositiveOrNegative(0));
    }
}