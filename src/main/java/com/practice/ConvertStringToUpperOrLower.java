package com.practice;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperOrLower {
    public List<String> convertToUpperCase(List<String> stringList, boolean toUpperCase){
        return stringList.stream()
                .map(str -> toUpperCase ? str.toUpperCase() : str.toLowerCase())
                .collect(Collectors.toList());
    }
}
