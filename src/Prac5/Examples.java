package Prac5;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Введите номер задания (1-6): ");
        int n = in.nextInt();
        int k;
        switch (n){
            case 1:
                System.out.println("Треугольная последовательность");
                System.out.print("Введите число k: ");
                k = in.nextInt();
                ex1(1, k);
                break;
            case 2:
                System.out.println("От 1 до n");
                System.out.print("Введите число n: ");
                k = in.nextInt();
                ex2(1, k);
                break;
            case 3:
                System.out.println("От A до B");
                System.out.print("Введите числа А и В: ");
                k = in.nextInt();
                n = in.nextInt();
                ex3(k, n);
                break;
            case 4:
                System.out.println("Заданная сумма цифр");
                System.out.print("Введите числа k и s: ");
                k = in.nextInt();
                n = in.nextInt();
                int l = 1;
                for (int i = 1; i < k; i++){
                    l*=10;
                }
                ex4(l, l*10, n, 0);
                break;
            case 5:
                System.out.println("Сумма цифр числа");
                System.out.print("Введите число N: ");
                n = in.nextInt();
                ex5(0, n, n);
                break;
            case 6:
                System.out.println("Проверка числа на простоту");
                System.out.print("Введите число n: ");
                n = in.nextInt();
                if(ex6(2, n, true)){
                    System.out.print("YES");
                }else  System.out.print("NO");
                break;
        }
}
    private static void ex1(int i, int n){
        if(i <= n) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            ex1(i+1, n);
        }
    }
    private static void ex2(int i, int n){
        if(i <= n) {
            System.out.print(i + " ");
            ex2(i+1, n);
        }
    }
    private static void ex3(int A, int B){
        if (A < B){
                System.out.print(A + " ");
                ex3(A+1, B);
        }else if (A > B)
        {
                System.out.print(B + " ");
                ex3(B+1, A);
        }else  System.out.print(A);
    }
    private static void ex4(int l, int L, int B, int N){
        if(l < L) {
            int s = 0;
            int l1 = l;
            while (l1 > 0)
            {
                s = s + l1 % 10;
                l1 = l1 / 10;
            }
            if (s == B) {
                N++;
            }
            ex4(l+1, L, B, N);
        }else {
            System.out.println("Количество таких чисел: " + N);
        }
    }
    private static void ex5(int s, int n, int N){
        if(N > 0) {
            s = s + N % 10;
            N = N / 10;
            ex5(s, n, N);
        }else
            System.out.println("Сумма цифр числа " + n + " : " + s);
    }
    private static boolean ex6(int i, int n, boolean pr){
        if (i < n/2 && pr)
        {
            if (n % i == 0){
                pr = false;
                return pr;
            }else ex6(i+1, n, true);
        }else return pr;
        return pr;
    }
}
