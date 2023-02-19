package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(console.readLine()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = fileReader.readLine()) != null){
            stringBuilder.append(line);
        }
        console.close();
        fileReader.close();

        Document document = Jsoup.parse(stringBuilder.toString(), "", Parser.xmlParser());
        Elements elem = document.select(args[0]);
        for (Element elements : elem){
            System.out.println(elements);
        }
    }
}
