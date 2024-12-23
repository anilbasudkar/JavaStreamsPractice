package com.practice;

public class CheckIfTheLetterIsConsonantOrVowel {
    public static void main(String[] args) {
        char ch='m';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            case 'm':
                System.out.println(ch + " is for monkey");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }


    }

}
