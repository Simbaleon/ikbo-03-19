package Prac11;

public interface Queue<E> {
    void enqueue  (E e);
    boolean isEmpty ();
    void clear  ();
    E element();
    E dequeue ();
    int size();
}