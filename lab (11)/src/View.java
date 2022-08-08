import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class View extends JFrame {
    private JLabel label1 = new JLabel("Прізвище ");
    private JLabel label2 = new JLabel("Номер     ");

    private JLabel label3 = new JLabel("Кількість записів ");
    private JTextField text1 = new JTextField(20);
    private JTextField text2 = new JTextField(20);

    private JTextField text3 = new JTextField(4);
    private JButton button1 = new JButton("Друкувати");

    ArrayList<Notebook> people = new ArrayList<Notebook>();

    View(){
        super("Додавання записів");
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

        JPanel p4 = new JPanel();
        c.add(p4);
        p4.setLayout(new FlowLayout());
        p4.add(label3);
        text3.setText("0");
        p4.add(text3);


        text2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text1.getText().isEmpty()) {
                    people.add(new Notebook(text1.getText(), Integer.parseInt(text2.getText())));
                    text1.setText("");
                    text2.setText("");
                    text3.setText(String.valueOf(people.size()));
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printAll(people);
            }
        });

    }

    private static void printAll(ArrayList<Notebook> all){
        ListIterator<Notebook> iter = all.listIterator();
        while(iter.hasNext()){
            Notebook item = iter.next();
            System.out.println(item.getSurname() + " - " + item.getAge());
        }
    }
}
