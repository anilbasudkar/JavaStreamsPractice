package com.practice;

import java.util.List;

public class AverageListOfIntegers {

    public Double averageValue(List<Integer> integerList){
        return integerList.stream()
                .mapToDouble( Integer::doubleValue)
                .average()
                .orElse(0.0);
    }
}
