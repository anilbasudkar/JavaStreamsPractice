package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegersTest {

    AddTwoIntegers addTwoIntegers = new AddTwoIntegers();

    @Test
    void addTwoIntegers() {
        Integer expectedResult = 12;
        Assertions.assertEquals(expectedResult, addTwoIntegers.addTwoIntegers(5,7));

    }
}