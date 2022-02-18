import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame implements ActionListener {
    private JTextField value = new JTextField("0");

    public Counter() {
        setSize(300, 300);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Число");
        label.setBounds(80, 50, 50, 30);
        value.setBounds(130, 50, 30, 30);
        value.setEditable(false);
        add(value);

        JButton but1 = new JButton("+1");
        but1.setBounds(180, 50, 30, 30);
        but1.addActionListener(this);
        JButton but2 = new JButton("-1");
        but2.setBounds(180, 80, 30, 30);
        but2.addActionListener(this);

        add(label);
        add(but1);
        add(but2);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getActionCommand().equals("+1")) {
            String valueFromTextField = value.getText();
            int b = Integer.parseInt(valueFromTextField);
            if (b < 3) {
                b++;
                value.setText(Integer.toString(b));
            }
        } else if (a.getActionCommand().equals("-1")) {
            int b = Integer.parseInt(value.getText());
            if (b > -5) {
                b--;
                value.setText(Integer.toString(b));
            }
        }
    }
        public static void main (String[]args){
            new Counter();
    }
}
