package ru.mirea.lab9;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        new ThrowsDemo().getKey();
    }

    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try {
            printDetails( key );
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            getKey();
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string. Enter the correct key" );
        }
        return "data for " + key;
    }
}