package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Petrov", 3.0);
        grades.put("Sidorov", 3.7);
        grades.put("Kozlov", 4.0);
        grades.put("Vodkin", 2.7);
        grades.put("Зубенко Михаил Петрович", 5.0);


    }
}
