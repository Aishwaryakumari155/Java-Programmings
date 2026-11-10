
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Program10 extends Applet implements ActionListener {

    TextField t1, t2;
    Button b;
    Label result;

    public void init() {

        add(new Label("First Number:"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Second Number:"));
        t2 = new TextField(10);
        add(t2);

        b = new Button("Add");
        add(b);

        result = new Label("Result: ");
        add(result);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int c = Integer.parseInt(t2.getText());

        int sum = a + c;

        result.setText("Sum = " + sum);
    }
}