package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class View extends JFrame {

    private JLabel label1 = new JLabel("Поле вводу  ");
    private JLabel label2 = new JLabel("Поле виводу ");
    private JTextField text1 = new JTextField(20);
    private JTextField text2 = new JTextField(20);
    private JButton button1 = new JButton("Скопіювати");
    private JButton button2 = new JButton("Друкувати");
    private LinkedList<String> result = new LinkedList<>();
    View(){
        super("Вікно входу");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e) {
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setSize(400,150);
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        JPanel p1 = new JPanel();
        c.add(p1);
        p1.setLayout(new FlowLayout());
        p1.add(label1);
        p1.add(text1);
        JPanel p2 = new JPanel();
        c.add(p2);
        p2.setLayout(new FlowLayout());
        p2.add(label2);
        p2.add(text2);

        JPanel p3 = new JPanel();
        c.add(p3);
        p3.setLayout(new FlowLayout());
        p3.add(button1);
        p3.add(button2);

        text1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text2.setText("Вивід через Enter: " + text1.getText());
                result.add("Вивід через Enter: " + text1.getText());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text2.setText("Вивід через кнопку:" + text1.getText());
                result.add("Вивід через кнопку:" + text1.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(result.toString());
            }
        });

    }
}
