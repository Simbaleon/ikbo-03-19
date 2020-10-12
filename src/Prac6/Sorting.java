package Prac6;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student((int)(Math.random() * 256), "Имя" + i);
        }
        System.out.println(Arrays.toString(students));
        selectionSort(students);
        System.out.println(Arrays.toString(students));
    }

    private static void selectionSort(Comparable[] students) {
        int min;
        Comparable temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (students[scan].compareTo(students[min]) < 0)
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
    }
}