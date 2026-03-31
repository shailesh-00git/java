import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileSave {
    public FileSave() {
        JFrame frame = new JFrame("Save Name");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel name = new JLabel("Enter Name:");
        JLabel email = new JLabel("Enter Email:");
        JLabel address = new JLabel("Enter Address:");
        JTextField fname = new JTextField(15);
        JTextField femail = new JTextField(15);
        JTextField faddress = new JTextField(15);
        JButton btn = new JButton("Save");
        JLabel result = new JLabel("");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = fname.getText();
                    String email = femail.getText();
                    String address = faddress.getText();

                    // Save to file
                    FileWriter fw = new FileWriter("names.txt", true); // true = append mode
                    fw.write(name + " " + email + " " + address + "\n");
                    fw.close();

                    result.setText("Saved successfully!");
                } catch (Exception ex) {
                    System.out.println(ex);
                    result.setText("Error saving file!");
                }
            }
        });

        frame.add(name);
        frame.add(fname);
        frame.add(email);
        frame.add(femail);
        frame.add(faddress);
        frame.add(address);
        frame.add(btn);
        frame.add(result);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileSave();
            }
        });
    }
}