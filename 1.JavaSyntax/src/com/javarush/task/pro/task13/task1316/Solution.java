package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();
        for (JavarushQuest q : quests){
            //System.out.println(q);
            System.out.println(q.ordinal());
        }

    }
}
