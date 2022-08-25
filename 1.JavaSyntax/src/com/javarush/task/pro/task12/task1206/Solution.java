package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";
        System.out.println(string);
        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countD = 0;
        for (char element : string.toCharArray()) {
            if (Character.isDigit(element)) countD++;
        }
        return countD;
    }

    public static int countLetters(String string) {
        int countL = 0;
        for (char element : string.toCharArray()) {
                    if(Character.isLetter(element)) countL++;
        }
        return countL;
    }

    public static int countSpaces(String string) {
        int countS = 0;
        for (char element: string.toCharArray()) {
            if (Character.isSpaceChar(element)) countS++;
        }
        return countS;
    }
}
