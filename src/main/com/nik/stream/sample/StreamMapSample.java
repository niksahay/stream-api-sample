package com.nik.stream.sample;

import java.util.Arrays;
import java.util.List;

/*
 * This sample demonstrate how map operator can be applied on stream of collection of elements to perform a final function
 * map and filter both are intermediate state of a stream functions, we must have to call another function to get hold of these values as output
 *
 */
public class StreamMapSample {


    public static void main(String[] args) {

        StreamMapSample streamMapSample = new StreamMapSample();
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5);

        streamMapSample.getSumOfMod(integerList);

        streamMapSample.getSumOfDouble(integerList);

        streamMapSample.countEvenNumbers(integerList);


    }


    private void getSumOfMod(List<Integer> integerList) {
        System.out.println(integerList.stream().map(i -> i % 2).reduce(0, (a, b) -> a + b));
    }

    private void getSumOfDouble(List<Integer> integerList) {
        System.out.println(integerList.stream().map(i -> i * 2).reduce(0, (a, b) -> a + b));
    }

    private void countEvenNumbers(List<Integer> integerList) {

        System.out.println(integerList.stream().map(i -> i + 1).filter(i -> i % 2 == 0).count());
    }
}
