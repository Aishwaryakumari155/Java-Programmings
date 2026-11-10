
import javax.swing.*;
import java.awt.event.*;

public class Program9 extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b;
    JLabel result;

    Program9() {

        setTitle("Addition Calculator");
        setSize(300, 200);
        setLayout(null);

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(20, 20, 100, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(130, 20, 120, 25);
        add(t1);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(20, 55, 100, 25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(130, 55, 120, 25);
        add(t2);

        b = new JButton("Add");
        b.setBounds(90, 90, 100, 25);
        add(b);

        result = new JLabel("Result: ");
        result.setBounds(90, 125, 150, 25);
        add(result);

        b.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int c = Integer.parseInt(t2.getText());

        int sum = a + c;

        result.setText("Result: " + sum);
    }

    public static void main(String[] args) {
        new Program9();
    }
}