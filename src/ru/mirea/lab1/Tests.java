package ru.mirea.lab1;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        System.out.print("Введите номер задания: ");
        Scanner in = new Scanner(System.in);
        int pr = in.nextInt();
        while (pr != 0)
        {
            switch (pr)            {
                case 1:
                    test1();
                    break;
                case 2:
                    test2(args);
                    break;
                case 3:
                    test3();
                    break;
                case 4:
                    test4();
                    break;
                case 5:
                    test5();
                    break;
                default:
                    return;
            }
            System.out.println();
            System.out.print("Введите номер следующего задания: ");
            pr = in.nextInt();
        }
    }

    private static void test1() {
        System.out.print("Введите количество элементов: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        i = 0;

        while (i < n) {
            System.out.print(ar[i] + " ");
            i++;
        }

        System.out.println();
        i = 0;
        do {
            System.out.print(ar[i] + " ");
            i++;
        } while (i < n);
    }

    private static void test2(String[] args) {
        for (String str : args) {
            System.out.print(" " + str);
        }
    }

    private static void test3() {
        System.out.print(1 + "  ");
        for (int k = 1; k < 11; k++) {
            System.out.print(1 + "/" + k + "  ");
        }
    }

    private static void test4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = (int) (Math.random()*100);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    private static void test5()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(getFac(n));
    }

    private static int getFac(int n)
    {
        int s = 1;
        for (int i = 1; i < n+1; i++)
        {
            s = s * i;
        }
        return s;
    }
}

