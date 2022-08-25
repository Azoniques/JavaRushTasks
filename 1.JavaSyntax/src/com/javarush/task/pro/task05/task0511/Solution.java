package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            multiArray[i] = new int[console.nextInt()];
           
        }
    }
}
