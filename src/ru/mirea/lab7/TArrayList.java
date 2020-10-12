package ru.mirea.lab7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class TArrayList {
    private TArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        System.out.print("Введите сколько элементов ввести: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str;
        for (int i = 0; i < n; i++)
        {
            System.out.print("Введите элемент #" + (i+1) + " : ");
            str = in.next();
            list.add(i, str);
        }
        System.out.println("Начальный список успешно создан");
        commands();
        while (true) {
            System.out.print("Введите новую команду: ");
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Введите новый элемент: ");
                    str = in.next();
                    list.add(str);
                    System.out.println("Элемент успешно добавлен");
                    commands();
                    break;
                case 2:
                    System.out.print("Введите элемент, который нужно удалить: ");
                    str = in.next();
                    list.remove(str);
                    System.out.println("Элемент успешно удален");
                    commands();
                    break;
                case 3:
                    System.out.print("Введите номер элемента, который нужно заменить: ");
                    n = in.nextInt();
                    System.out.print("Введите элемент на который нужно заменить " + list.get(n-1) + " :  ");
                    str = in.next();
                    list.set(n, str);
                    System.out.println("Элемент успешно заменен");
                    commands();
                    break;
                case 4:
                    System.out.print("Введите элемент, который необходимо найти: ");
                    str = in.next();
                    if (list.contains(str))
                        System.out.println("Элемент '" + str + "' содержится в данном списке");
                    else
                        System.out.println("В данном списке нет такого элемента");
                    commands();
                    break;
                case 5:
                    ArrayList<String> list2 = new ArrayList<String>();
                    System.out.print("Введите сколько элементов ввести: ");
                    n = in.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Введите элемент #" + (i+1) + " : ");
                        str = in.next();
                        list2.add(i, str);
                    }
                    list.addAll(list2);
                    System.out.println("Новый список успешно добавлен");
                    commands();
                    break;
                case 6:
                    System.out.println("Список:");
                    for (int i = 0; i < list.size(); i++)
                        System.out.println((i+1) + ") " + list.get(i));
                    System.out.println("---------------------------------------");
                    break;
                case 0:
                    exit(0);
                    break;
            }
        }
    }

    private void commands()
    {
        System.out.println("---------------------------------------");
        System.out.println("[1] - Добавить элемент");
        System.out.println("[2] - Удалить элемент");
        System.out.println("[3] - Заменить элемент");
        System.out.println("[4] - Найти элемент");
        System.out.println("[5] - Добавить список");
        System.out.println("[6] - Вывести список");
        System.out.println("[0] - Выход");
        System.out.println("---------------------------------------");
}

    public static void main(String[] args) {
        new TArrayList();
    }
}