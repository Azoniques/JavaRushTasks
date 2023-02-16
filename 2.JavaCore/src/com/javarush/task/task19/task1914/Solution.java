package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IllegalArgumentException {
        PrintStream defaultPS = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();
        String str = byteArrayOutputStream.toString();
        String [] split = str.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
        int c = 0;
        switch (split[1]) {
            case "+": c = a + b;
                break;
            case "-": c = a - b;
                break;
            case "*": c = a * b;
        }

        System.setOut(defaultPS);

        System.out.println(str.replace("=", "= "+c));
        
        
        

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

