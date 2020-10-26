package Prac11;

import java.util.Scanner;

public class test {
    public static void main(String[] ar) {
        ArrayQueueModule<Integer> aqm = new ArrayQueueModule<>();
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        Scanner scan = new Scanner(System.in);
        int n, temp;
        System.out.println("Введите количество значений: ");
        n = scan.nextInt();
        for (int i = 1; i < n+1; i++) {
            System.out.print("Введите " + i + " значение: ");
            temp = scan.nextInt();
            aqm.add(temp);
            lq.enqueue(temp);
        }
        ArrayQueue<Integer> aq = new ArrayQueue<>(aqm.getList());
        ArrayQueueADT<Integer> aqa = new ArrayQueueADT<>();
        System.out.println(lq);
        System.out.println(aq.element());
        System.out.println(aqa.size(aqm.getList()));
        System.out.println(aqm);
        lq.dequeue();
        aq.enqueue (13);
        System.out.println(lq);
        System.out.println(aq);
        aqa.enqueue(aqm.getList(), 15);
        System.out.println(aqm);
    }
}