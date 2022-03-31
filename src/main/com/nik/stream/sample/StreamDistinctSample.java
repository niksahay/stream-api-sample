package com.nik.stream.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StreamDistinctSample {

    public static void main(String[] args) {
        Integer      intArray[] ={1,3,6,4,2,3,4,5,6};
        Set<Integer> unique     =new HashSet<>();

        //Print duplicates only for an input Array

        Arrays.asList(intArray).stream().filter(i->!unique.add(i)).toList().forEach(System.out::println);
        //Print unique elements

        Arrays.asList(intArray).stream().distinct().forEach(System.out::println);

        //Print unique element of an array in sorted Order
        Arrays.asList(intArray).stream().distinct().sorted().forEach(System.out::println);
    }
}
