package com.javarush.task.task34.task3401;

/* 
Числа Фибоначчи с помощью рекурсии
*/

import java.time.Duration;
import java.time.Instant;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Instant start = Instant.now();
        System.out.println(solution.fibonacci(50));//34
        Instant finish = Instant.now();
        /*System.out.println(solution.fibonacci(5));     //5

        System.out.println(solution.fibonacci(2));     //1
        System.out.println(solution.fibonacci(1));     //1*/
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("calculating time: " + elapsed);
    }

    public int fibonacci(int n) {
        if (n==1 || n==2) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
