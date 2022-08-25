package com.javarush.task.pro.task17.task1709;

public class Foo {
    public static void main(String[] args)
    {
        Student student = new StudentImpl("ESKOBAR");
        System.out.println(student.getName());
    }
}
