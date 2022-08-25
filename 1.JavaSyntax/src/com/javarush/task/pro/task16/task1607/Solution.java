package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();

        return today;
    }

    static LocalDate ofExample() {
        LocalDate example = LocalDate.of(2020,9,12);

        return example;
    }

    static LocalDate ofYearDayExample() {
        LocalDate year = LocalDate.ofYearDay(2020,256);

        return year;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate epoch = LocalDate.ofEpochDay(18517);

        return epoch;
    }
}
