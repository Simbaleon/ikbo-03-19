package ru.mirea.lab3;

public class Corgi extends Dog {
    public Corgi(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String toString() {
        return "Далматин {\n" +
                "\t\tимя = " + getName() + "\n" +
                "\t\tвозраст = " + getAge() + " лет\n" +
                "\t\tцвет = " + getColor() + " }";
    }
}