package ru.mirea.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Введите дату в формате dd/mm/yyyy (Начиная с 1900 года до 9999 года): ");
        Scanner s = new Scanner(System.in);
        Pattern p = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/](1[9]\\d{2}|[2-9]\\d{3})");
        Matcher m = p.matcher(s.nextLine());
        boolean result = m.matches();
        if (result) System.out.print("Дата введена верно");
        else System.out.print("Дата введена неверно");
    }
}