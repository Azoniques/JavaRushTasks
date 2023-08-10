package com.javarush.task.task31.task3102;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {


        List<String> list = Files.walk(Paths.get(root))
                .filter(Files::isRegularFile)
                .map(Path::toAbsolutePath)
                .map(Path::toString)
                .collect(Collectors.toList());





        return list;

    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String directory = br.readLine();
            System.out.println(getFileTree(directory));
        } catch (IOException e) {
            System.out.println("Path is wrong");
        }

    }
}
