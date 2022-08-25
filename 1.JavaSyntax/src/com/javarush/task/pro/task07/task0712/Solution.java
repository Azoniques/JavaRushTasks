package com.javarush.task.pro.task07.task0712;

/* 
Первые объекты
*/

import java.util.Scanner;

public class Solution {

    public static void printPoints(int[] x, int[] y, int[] color)
    {
        for (int i = 0; i < x.length; i++)
            System.out.println("Цвет точки x=" + x[i] + ", y=" + y[i] + " " + color[i]);
    }

    public static void main(String[] args)
    {
        int[] x = new int[100];
        int[] y = new int[100];
        int[] color = new int[100];
        printPoints(x, y, color);
    }

    /*public static void main(String[] args) {
        String s0 = new String("ghbdtn0");
        String s1 = new String("ghbdtn1");
        String s2 = new String("ghbdtn2");
        String s3 = new String("ghbdtn3");
        String s4 = new String("ghbdtn4");
        String s5 = new String("ghbdtn5");
        String s6 = new String("ghbdtn6");
        String s7 = new String("ghbdtn7");
        String s8 = new String("ghbdtn8");
        String s9 = new String("ghbdtn9");
        int[] i1 = new int[1];
        int[] i2 = new int[1];
        int[] i3 = new int[1];
        int[] i4 = new int[11];
        int[] i5 = new int[1];
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(s1);
    }
     */
}
