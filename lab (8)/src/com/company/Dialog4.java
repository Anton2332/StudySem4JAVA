package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dialog4 extends JFrame {
    JTextField fld = new JTextField(20);
    JButton btn = new JButton("Натиснути");
    JLabel lbl = new JLabel(" ");
    Dialog4() {
        super("Слухачі (listeners) полів та кнопок");
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
            ;
        }
        catch(Exception e) {
        }
        setSize(400, 150);
        Container c = getContentPane();
        JPanel panel = new JPanel();
        c.add(panel);
        panel.add(lbl, BorderLayout.NORTH);
        panel.add(fld, BorderLayout.CENTER);
        panel.add(btn, BorderLayout.SOUTH);
        fld.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Введений текст:"+fld.getText());
            }
        });
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Натиснута кнопка");
            }
        });
        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        setVisible(true);
    }
}

