import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;

class AddDemo {
    AddDemo() {
        // default code to create window
        JFrame jframe = new JFrame("Add");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(500, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // name of input fields
        JLabel num1 = new JLabel("Value 1:");
        JLabel num2 = new JLabel("Value 2:");
        JLabel result = new JLabel();

        // input field
        JTextField textfield1 = new JTextField(5);
        JTextField textfield2 = new JTextField(5);

        // button
        JButton btn = new JButton("Sum");

        // listener
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int v1 = Integer.parseInt(textfield1.getText());
                int v2 = Integer.parseInt(textfield2.getText());

                int sum = v1 + v2;

                result.setText("Sum =  " + sum);
            }
        });

        // adding element to jframe
        jframe.add(num1); // label value: 1
        jframe.add(textfield1);
        jframe.add(num2); // label value: 2
        jframe.add(textfield2);
        jframe.add(btn);
        jframe.add(result);

        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AddDemo();
            }
        });
    }

}
