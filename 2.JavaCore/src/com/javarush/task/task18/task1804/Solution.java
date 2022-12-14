package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] array = new int[256];
        try (FileInputStream fis = new FileInputStream(
                new BufferedReader(
                        new InputStreamReader(System.in)).readLine())) {
            while (fis.available() > 0) array[fis.read()]++;
        }
        int minMatch = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < minMatch) minMatch = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minMatch) System.out.print(i + " ");

        }


    }
}
