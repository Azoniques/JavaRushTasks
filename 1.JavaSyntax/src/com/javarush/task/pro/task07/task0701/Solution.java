package com.javarush.task.pro.task07.task0701;

/* 
Все возможные типы
*/

public class Solution {
//    short s = 1;
//    byte b = 2;
//    int i = 3;
//    long l = 398493487;
//    float f = 4;
//    double d = 0.2344;
//    boolean boo = true;
//    char a = 35;


    public static int N = 10;

    public static void drawValue(double y)
    {
        int value = (int) (y * N) + N;
        for (int i = 0; i < 2 * N; i++)
        {
            char c = i == N ? '|': '.';
            if (i == value)
                c = '*';
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 10 * N; i++)
        {
            double x = i * 1.0 / N;
            double y = Math.sin(x);
            drawValue(y);
        }
    }



}
