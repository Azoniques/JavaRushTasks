package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Foo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}
