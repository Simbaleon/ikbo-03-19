package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Numbers extends JFrame {
    private int number, i = 0;

    Numbers() {
        setLayout(new FlowLayout());
        setTitle("Угадайте загаданное число от 1 до 20");
        TextField textField = new TextField();
        textField.setSize(150,150);
        Button button = new Button("OK");
        number = (int) (Math.random() * 21);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (i < 3) {
                    int n = Integer.parseInt(textField.getText());
                    if (n == number) {
                        JOptionPane.showMessageDialog(null, "Вы угадали", "Победа",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                    else if (n < number) {
                        i++;
                        if(i == 3){
                            JOptionPane.showMessageDialog(null, "Попытки закончились" + '\n' + "Загаданное число: " + number,
                                    "Вы проиграли", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                        }else
                        JOptionPane.showMessageDialog(null, "Вы не угадали, попробуйте число больше" + '\n' + "Осталось попыток: " + (3-i),
                                "Неудача",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        i++;
                        if(i == 3){
                            JOptionPane.showMessageDialog(null, "Попытки закончились" + '\n' + "Загаданное число: " + number,
                                    "Вы проиграли", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                        }else
                        JOptionPane.showMessageDialog(null, "Вы не угадали, попробуйте число меньше" + '\n' + "Осталось попыток: " + (3-i),
                                "Неудача",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Попытки закончились", "Вы проиграли", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        });
        add(textField);
        add(button);
        setVisible(true);
        setSize(300, 200);
    }
}
