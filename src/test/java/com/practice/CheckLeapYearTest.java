package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckLeapYearTest {
 CheckLeapYear cly = new CheckLeapYear();
    @Test
    void checkIfTheYearIsLeap_2001() {
        Boolean expectedResult= false;
        Assertions.assertEquals(expectedResult,cly.checkIfTheYearIsLeap(2001));
    }

    @Test
    void checkIfTheYearIsLeap_2000() {
        Boolean expectedResult= true;
        Assertions.assertEquals(expectedResult,cly.checkIfTheYearIsLeap(2000));
    }
    @Test
    void checkIfTheYearIsLeap_2100() {
        Boolean expectedResult= false;
        Assertions.assertEquals(expectedResult,cly.checkIfTheYearIsLeap(2100));
    }
    @Test
    void checkIfTheYearIsLeap_2004() {
        Boolean expectedResult= true;
        Assertions.assertEquals(expectedResult,cly.checkIfTheYearIsLeap(2004));
    }
}