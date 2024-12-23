package com.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageListOfIntegersTest {

    AverageListOfIntegers averageListOfIntegers = new AverageListOfIntegers();
   @Test
    public void calculateAverage(){
       List<Integer> integerList = List.of(1,3,4,5,6,78,3,32,48);
       Assertions.assertEquals(20.0, averageListOfIntegers.averageValue(integerList));
   }

}