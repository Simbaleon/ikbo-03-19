package ru.mirea.lab5;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(getColor());
        gr2d.fillOval(getX(), getY(), 2*radius, 2*radius);
        gr2d.setColor(Color.BLACK);
    }
}