package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test extends JFrame {

    private static int nextX = 20;
    private static int nextY = 20;
    private static int WIDTH = 800;

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Test();
    }

    private Test() {
        super("Shapes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        int HEIGHT = 700;
        for (int j = 0; j < 20; j++) {
            Shape figure = getRandomShape();
            figure.setBounds(0, 0, WIDTH, HEIGHT);
            lp.add(figure);
        }
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    private static Shape getRandomShape() {
        Random random = new Random();
        int width = random.nextInt(50) + 50;
        int height = random.nextInt(50) + 50;
        int x = nextX;
        int y = nextY + 40;
        if (nextX + x <= WIDTH - x) {
            nextX += 70;
        } else {
            nextX = 20;
            nextY += 70;
        }
        Color color = getRandomColor();
        switch (random.nextInt(3)) {
            case 0:
                return new Circle(x, y, color,  width / 2);
            case 1:
                return new Rectangle(x, y, color,  width, height);
            case 2:
                return new Square(x, y, color,  width);
        }
        return new Circle(x, y, color,  width / 2);
    }

    private static Color getRandomColor() {
        Random randomGenerator = new Random();
        int r = randomGenerator.nextInt(256);
        int g = randomGenerator.nextInt(256);
        int b = randomGenerator.nextInt(256);
        return new Color(r, g, b);
    }
}