import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class FactCubeApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Math Operations");
        JTextField input = new JTextField(10);
        JButton btn = new JButton("Press for Fact / Release for Cube");
        JLabel output = new JLabel("Result will appear here");

        btn.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int n = Integer.parseInt(input.getText());
                    long fact = 1;
                    for (int i = 1; i <= n; i++)
                        fact *= i;
                    output.setText("Factorial: " + fact);
                } catch (Exception ex) {
                    output.setText("Invalid Input");
                }
            }

            public void mouseReleased(MouseEvent e) {
                try {
                    int n = Integer.parseInt(input.getText());
                    output.setText("Cube: " + (n * n * n));
                } catch (Exception ex) {
                    output.setText("Invalid Input");
                }
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(input);
        frame.add(btn);
        frame.add(output);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}