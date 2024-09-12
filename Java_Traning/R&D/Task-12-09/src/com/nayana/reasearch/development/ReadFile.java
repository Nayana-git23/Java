package com.nayana.reasearch.development;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
	public static void main(String[] args) {
        String fileName = "panther.txt";  // Path to your file

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String value = br.readLine();  // Reads the first line
            System.out.println("Value from file: " + value);  // Prints the value on console
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
