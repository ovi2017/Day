import javax.swing.*;
import java.awt.*;


public class Layout extends JFrame {


    private JButton button1, button2, button3, button4;
    public Layout() {
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        setLayout(new GridLayout(2, 2));
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        setVisible(true);
        setSize(new Dimension(200, 200));
    }
}