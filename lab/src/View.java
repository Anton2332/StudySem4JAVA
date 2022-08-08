import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListIterator;

public class View extends JFrame {


    private JLabel label = new JLabel();
    private JRadioButton radioButton1 = new JRadioButton();
    private JRadioButton radioButton2 = new JRadioButton();
    private JRadioButton radioButton3 = new JRadioButton();
    private JRadioButton radioButton4 = new JRadioButton();
    private JPanel p1;
    private Container c;
    private double ball = 0.0;
    private int n = -1;

    private JButton button = new JButton("Далі");
    private ButtonGroup group = new ButtonGroup();

    private String g ;

    private ListIterator<Test> iter;
    private Test item;

    View(ArrayList<Test> tests){
        super("Додавання записів");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e) {
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setSize(450,600);

        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);

        iter = tests.listIterator();
        item = iter.next();


        c = getContentPane();
        c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
        p1= new JPanel();
        c.add(p1);
        p1.setLayout(new GridLayout(0,1));
        label.setText(item.getStr1());
        String[] array = item.getArr1();
        radioButton1.setText(array[0]);
        radioButton2.setText(array[1]);
        radioButton3.setText(array[2]);
        radioButton4.setText(array[3]);

        p1.add(label);
        p1.add(radioButton1);
        p1.add(radioButton2);
        p1.add(radioButton3);
        p1.add(radioButton4);
        p1.add(button);

        ActionListener sliceActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton button = (JRadioButton) e.getSource();
                if(button == radioButton1) {
                    g = radioButton1.getText();
                } else if (button == radioButton2) {
                    g = radioButton2.getText();
                } else if (button == radioButton3) {
                    g = radioButton3.getText();
                } else if (button == radioButton4) {
                    g = radioButton4.getText();
                }
            }
        };

        radioButton1.addActionListener(sliceActionListener);
        radioButton2.addActionListener(sliceActionListener);
        radioButton3.addActionListener(sliceActionListener);
        radioButton4.addActionListener(sliceActionListener);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!g.isEmpty()){
                if(g == item.getArrTrue()){
                    item.setBall(5);
                }else{
                    item.setBall(2);
                }
                    if(iter.hasNext()){
                        item = iter.next();
                        label.setText(item.getStr1());
                        String[] array = item.getArr1();
                        radioButton1.setText(array[0]);
                        radioButton2.setText(array[1]);
                        radioButton3.setText(array[2]);
                        radioButton4.setText(array[3]);
                    }

                }
                if(!iter.hasNext()){
                    p1.remove(radioButton1);
                    p1.remove(radioButton2);
                    p1.remove(radioButton3);
                    p1.remove(radioButton4);
                    p1.remove(button);

                    while(iter.hasPrevious()){
                        ball += iter.previous().getBall();
                        n += 1;
                    }
                    label.setText("Середній балл : " + ball/n);
                }
            }
        });



    }

}
