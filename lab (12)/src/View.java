import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class View extends JFrame {
    private JLabel label1 = new JLabel("Функція: Y=A*sqrt(X)*Sin(A*X)");
    private JLabel label2 = new JLabel("Параметр A");
    private JLabel label3 = new JLabel("Шар(h):");
    private JLabel label4 = new JLabel("Количество точек:");

    private JTextField text1 = new JTextField(15);
    private JTextField text2 = new JTextField(10);
    private JTextField text3 = new JTextField(10);

    private JTextArea textArea = new JTextArea(15,25);
    private JScrollPane scroll = new JScrollPane(textArea);

    View(){
        super("Додавання записів");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e) {
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setSize(450,600);
        Container c = getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        JPanel p1 = new JPanel();
        c.add(p1);
        p1.setLayout(new FlowLayout());
        p1.add(label1);

        JPanel p2 = new JPanel();
        c.add(p2);
        p2.setLayout(new FlowLayout());
        p2.add(label2);
        p2.add(text1);

        JPanel p3 = new JPanel();
        c.add(p3);
        p3.setLayout(new FlowLayout());
        p3.add(label3);
        p3.add(text2);
        p3.add(label4);
        p3.add(text3);

        JPanel p4 = new JPanel();
        c.add(p4);
        p4.setLayout(new FlowLayout());
        p4.add(scroll);

        text1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text1.getText().isEmpty() && !text2.getText().isEmpty() && !text3.getText().isEmpty()){
                    try{
                        float A = Float.parseFloat(text1.getText());
                        float h = Float.parseFloat(text2.getText());
                        int n = Integer.parseInt(text3.getText());

                        func(A,h,n);
                    }
                    catch (Exception r) {
                       System.out.println(r);
                    }
                }
            }
        });

        text2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text1.getText().isEmpty() && !text2.getText().isEmpty() && !text3.getText().isEmpty()){
                    try{
                        float A = Float.parseFloat(text1.getText());
                        float h = Float.parseFloat(text2.getText());
                        int n = Integer.parseInt(text3.getText());

                        func(A,h,n);
                    }
                    catch (Exception r) {
                        System.out.println(r);
                    }
                }
            }
        });

        text3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text1.getText().isEmpty() && !text2.getText().isEmpty() && !text3.getText().isEmpty()){
                    try{
                        float A = Float.parseFloat(text1.getText());
                        float h = Float.parseFloat(text2.getText());
                        int n = Integer.parseInt(text3.getText());

                        func(A,h,n);
                    }
                    catch (Exception r) {
                        System.out.println(r);
                    }
                }
            }
        });



    }

    private void func (float A,float h,int n){
        double x = 0;
        double y;
        for (int i = 0;i<n;i++){
            y = A * Math.sqrt(x) * Math.sin(A*x);
            textArea.append(y + "     " + x + "\n");
            x += h;
        }
    }

}
