package com.company;
import javax.swing.*;
import java.awt.*;

public class Problem1 extends JFrame {

    private JLabel label1 = new JLabel("Логін: ");
    private JLabel label2 = new JLabel("Пароль: ");
    private JTextField text1 = new JTextField(20);
    private JTextField text2 = new JTextField(20);
    private JButton button1 = new JButton("ОК");
    private  JButton button2 = new JButton("Відмінити");
    Problem1(){
        super("Вікно входу");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e) {
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,150);
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        JPanel p1 = new JPanel();
        c.add(p1);
        p1.setLayout(new FlowLayout());
        p1.add(label1);
        p1.add(Box.createRigidArea(new Dimension(10,0)));
        p1.add(text1);
        JPanel p2 = new JPanel();
        c.add(p2);
        p2.setLayout(new FlowLayout());
        p2.add(label2);
        p2.add(text2);

        JPanel p3 = new JPanel();
        c.add(p3);
        p3.setLayout(new FlowLayout());
        p3.add(Box.createRigidArea(new Dimension(100,0)));
        p3.add(button1);
        p3.add(button2);

    }
}
