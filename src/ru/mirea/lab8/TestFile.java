package ru.mirea.lab8;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    private String file = "C:\\Java\\Lab1\\src\\ru\\mirea\\lab8\\text.txt";
    private TestFile() {
        try {
            FileWriter writer = new FileWriter(file, true);
            Scanner in = new Scanner(System.in);
            System.out.print("Введите строку, которую нужно добавить: ");
            String str = in.nextLine();
            writer.append('\n');
            for (int i = 0; i < str.length();i++)
                writer.append(str.charAt(i));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TestFile();
    }
}