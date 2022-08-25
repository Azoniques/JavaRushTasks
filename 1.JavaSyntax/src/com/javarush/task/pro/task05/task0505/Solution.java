package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n > 0) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = console.nextInt();
            }
            if ((n & 1) != 0) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                }else{
                    for (int i = array.length-1; i >= 0; i--) {
                        System.out.println(array[i]);
                    }
                }
            }
        }
    }

