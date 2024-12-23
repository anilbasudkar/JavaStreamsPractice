package com.practice;

public class CheckWhetherCharacterIsAlphabetOrNot {
    public Boolean isAlphabetOrNot(char letter) {
        Boolean isAlphabet = true;
        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
            isAlphabet = true;
        else
            isAlphabet = false;
        return isAlphabet;
    }
}
