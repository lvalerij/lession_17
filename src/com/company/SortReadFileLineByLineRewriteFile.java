package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortReadFileLineByLineRewriteFile {
    public static void main(String[] args) {
        List<String> linesList = new ArrayList<>();
        try (
                BufferedReader  reader = new BufferedReader(new FileReader("input-file3.txt"));){
            String next = null;
            while ((next = reader.readLine()) != null) {
                linesList.add(next);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(linesList);
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("input-file3.txt", false));){
            for (String line : linesList) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}