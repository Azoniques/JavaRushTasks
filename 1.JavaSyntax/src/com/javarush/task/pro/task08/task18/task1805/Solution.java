package com.javarush.task.pro.task08.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String strings1, String strings2) {
                return strings1.length() - strings2.length();
            }
        };
        Collections.sort(strings, new StringComparator());
    }
}
