package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString;
        while (!("exit".equals(readString = reader.readLine()))){
            new ReadThread(readString).start();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        public void run(){
            byte [] bytes = new byte[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)){
                while (fileInputStream.available()>0){
                    int aByte = fileInputStream.read();
                    bytes[aByte] ++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int maxCount = 0;
            int targetByte = 0;
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i]> maxCount){
                    maxCount = bytes[i];
                    targetByte= i;
                }
            }
            resultMap.put(fileName, targetByte);
            for(Map.Entry entry : resultMap.entrySet()){
                System.out.println("Key: "+ entry.getKey() + "| Value: " + entry.getValue());
            }

        }
    }
}
