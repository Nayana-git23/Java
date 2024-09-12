package com.nayana.reasearch.development;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeFileConsole {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input from the console
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Mobile: ");
        String mobile = scanner.nextLine();

        String fileName = "rashmi.txt";  // Path to the file

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

        scanner.close();
    }

}
