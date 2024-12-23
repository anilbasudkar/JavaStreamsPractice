package com.practice;

import java.sql.SQLOutput;

public class SwapTwoNumbers {
    public  static void main(String[] args) {
       int num1 = 5, num2= 10;
        System.out.println("Numbers before swap num1 "+num1+" , num2 "+num2);
        int temp = num1;
        num1 = num2;
        num2 =temp;

        System.out.println("Numbers after swap num1 "+num1+" , num2 "+num2);



    }
}
