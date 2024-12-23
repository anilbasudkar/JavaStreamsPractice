package com.practice;

public class CheckIfNumberPositiveOrNegative {
    public Boolean isTheNumberPositiveOrNegative(int num1) {
        Boolean isPositive = true;
        if (num1 >= 0)
            isPositive = true;
        else
            isPositive = false;
        return isPositive;
    }
}
