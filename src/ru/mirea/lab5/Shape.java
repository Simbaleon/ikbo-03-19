package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    private int x;
    private int y;
    private Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}