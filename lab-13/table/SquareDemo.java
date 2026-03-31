import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareDemo {
    public SquareDemo() {
        JFrame jframe = new JFrame("Square");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(500, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Enter a number: ");
        JTextField text = new JTextField(6);
        JButton btn = new JButton("square");
        JLabel res = new JLabel("Enter a number: ");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int s = Integer.parseInt(text.getText());
                int square = s * s;
                res.setText("Square: " + square);
            }
        });
        jframe.add(jlab);
        jframe.add(text);
        jframe.add(btn);
        jframe.add(res);
        jframe.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SquareDemo();
            }
        });
    }
}
