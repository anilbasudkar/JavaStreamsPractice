package com.practice;

public class CheckLeapYear {
    public Boolean checkIfTheYearIsLeap(int year) {
        boolean leap = false;
        if(year % 4 ==0){
            if(year % 100 ==0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        }
        return leap;
    }

}
