package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Dialog2 {
    public Dialog2(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
        }
        JFrame frm = new JFrame("Вивід векторві");
        frm.setSize(300, 200);
        Container c = frm.getContentPane();
        double[] arr1 = {1, 2, 3, 4, 5};
        double[] arr2 = {2, 2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(arr1);
        DoubleVector v2 = new DoubleVector(arr2);

        c.add(new JLabel("Вектор 1 : " + v1.TestVector()));
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Вектор 2 : " + v2.TestVector()));
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Сума векторів : " + v1.sum(v2).TestVector()));
// фрагмент as is (2)
        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        frm.addWindowListener(wndCloser);
        frm.setVisible(true);
    }

}
