package com.javarush.task.pro.task08.task18.task1811.task1825;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/* 
Из потока данных — в строку
*/

public class Solution {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello world!")).start();
//        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");
//
//        System.out.println(getString(stringStream));
    }

//    public static String getString(Stream<String> stringStream) {
//
//        return stringStream.collect(Collectors.joining(" "));
//    }
}
