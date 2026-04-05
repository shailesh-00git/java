import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class stud {

    stud() {
        JFrame frame = new JFrame("Student Info");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // components
        JLabel name = new JLabel("Name: ");
        JTextField namef = new JTextField(10);
        JLabel address = new JLabel("Address: ");
        JTextField addressf = new JTextField(10);

        // terms and condiotions
        JLabel terms = new JLabel("Accept terms and conditions.");
        JCheckBox cb = new JCheckBox();

        // submit button
        JButton btn = new JButton("submit");

        // outputs
        JLabel output = new JLabel("");

        // action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (cb.isSelected()) {
                    try (FileWriter fw = new FileWriter("stud.txt", true);) {
                        fw.write(namef.getText() + "\t" + addressf.getText() + "\n");
                        output.setText("submitted successfully");
                        namef.setText("");
                        addressf.setText("");
                    } catch (Exception e) {
                        output.setText("Error: " + e.getMessage());
                    }
                } else {
                    output.setText("Accept terms and conditions");

                }
            }
        });

        // add on frame
        frame.add(name);
        frame.add(namef);
        frame.add(address);
        frame.add(addressf);
        frame.add(terms);
        frame.add(cb);
        frame.add(btn);
        frame.add(output);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new stud();
            }
        });
    }

}
