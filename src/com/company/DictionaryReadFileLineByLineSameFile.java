package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DictionaryReadFileLineByLineSameFile {
    public static void main(String[] args) {
        try (
                BufferedReader  reader = new BufferedReader(new FileReader("input-file4.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("input-file4.txt",true));){
            String next = null;
            Set<String> dictionary = new HashSet<>();
            while ((next = reader.readLine()) != null) {
                String string[] = next.toLowerCase().split("[,.\\s]+");
                for(String s : string){
                    dictionary.add(s);
                }
            }
            writer.newLine();
            for (String line : dictionary) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}