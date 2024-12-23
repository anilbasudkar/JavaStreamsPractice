package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckWhetherCharacterIsAlphabetOrNotTest {
    CheckWhetherCharacterIsAlphabetOrNot checkWhetherCharacterIsAlphabetOrNot = new CheckWhetherCharacterIsAlphabetOrNot();
    @Test
    void isAlphabetOrNot_s() {
        Boolean isAlphabet=true;
        Assertions.assertEquals(isAlphabet,checkWhetherCharacterIsAlphabetOrNot.isAlphabetOrNot('s'));
    }
    @Test
    void isAlphabetOrNot_E() {
        Boolean isAlphabet=true;
        Assertions.assertEquals(isAlphabet,checkWhetherCharacterIsAlphabetOrNot.isAlphabetOrNot('E'));
    }
    @Test
    void isAlphabetOrNot_percentile() {
        Boolean isAlphabet=false;
        Assertions.assertEquals(isAlphabet,checkWhetherCharacterIsAlphabetOrNot.isAlphabetOrNot('%'));
    }
    @Test
    void isAlphabetOrNot_4() {
        Boolean isAlphabet=false;
        Assertions.assertEquals(isAlphabet,checkWhetherCharacterIsAlphabetOrNot.isAlphabetOrNot('4'));
    }
}