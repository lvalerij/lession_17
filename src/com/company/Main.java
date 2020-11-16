package com.company;

import java.io.*;

public class Main {
// input: file
// 1. read data from file (FileReader and loop)
// 2. assgn to collection (which collection is better for unique words)
// 3. append the result to the same file
//output: list of unique words in the same file

    public static void readFileLineByLineTryWithRources(){
        try (
            BufferedReader reader = new BufferedReader(new FileReader("input-file2.txt"));){
            String next = null;
            while ((next = reader.readLine()) != null) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
