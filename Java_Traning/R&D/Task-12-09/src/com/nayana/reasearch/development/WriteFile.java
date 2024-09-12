package com.nayana.reasearch.development;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
        String fileName = "rashmi.txt";  // Path to your file
        String name = "Rashmi";
        String email = "rashmi@example.com";
        String mobile = "9876543210";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Name: " + name);
            bw.newLine();  // Adds a new line
            bw.write("Email: " + email);
            bw.newLine();  // Adds a new line
            bw.write("Mobile: " + mobile);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
	

}
