package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
        static {
            labels.put(5.5, "foo");
            labels.put(5.6, "bar");
            labels.put(5.7, "fooBar");
            labels.put(5.8, "fooB");
            labels.put(5.9, "fooBB");

        }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
