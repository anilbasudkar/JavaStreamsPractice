package com.practice;

import java.util.List;

public class SumOfOddOrEvenNumbers {
    public Integer sumOfNumbers(List<Integer> integerList, Boolean isEven){
        return integerList.stream()
                .filter(intVal -> isEven ? intVal % 2 == 0 : intVal%2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
