package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ConvertStringToUpperOrLowerTest {

    ConvertStringToUpperOrLower convertStringToUpperOrLower = new ConvertStringToUpperOrLower();


    @Test
    public void convertToChangeCase_UpperCase(){
        List<String> stringList = List.of("anil", "kumar");
        List<String> expectedStringList = List.of("ANIL", "KUMAR");
        Assertions.assertLinesMatch(expectedStringList,
        convertStringToUpperOrLower.convertToUpperCase(stringList, Boolean.TRUE));
    }

    @Test
    public void convertToChangeCase_LowerCase(){
        List<String> stringList = List.of("anil", "KUMAR");
        List<String> expectedStringList = List.of("anil", "kumar");
        Assertions.assertLinesMatch(expectedStringList,
                convertStringToUpperOrLower.convertToUpperCase(stringList, Boolean.FALSE));
    }

}