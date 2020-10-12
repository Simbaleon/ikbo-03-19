package Prac8;

public class BoundedWaitList<E> extends WaitList<E>{
    private final int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity)
            super.add(element);
        else
            System.err.println("The list is full.");
    }
}