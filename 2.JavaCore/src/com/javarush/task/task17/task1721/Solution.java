package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            allLines = Files.readAllLines(Paths.get(bufferedReader.readLine()));
            forRemoveLines = Files.readAllLines(Paths.get(bufferedReader.readLine()));
            Solution sol = new Solution();
            sol.joinData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
