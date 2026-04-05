
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class square {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Math Operations");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);

        JTextField input = new JTextField(10);
        JButton btn = new JButton("square");
        JLabel output = new JLabel("Result:");

        btn.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int n = Integer.parseInt(input.getText());

                    output.setText("Square: " + (n * n));
                } catch (Exception ex) {
                    output.setText("Invalid Input");
                }
            }

        });
        frame.add(input);
        frame.add(btn);
        frame.add(output);
        frame.setVisible(true);
    }
}