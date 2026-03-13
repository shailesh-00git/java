import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField nameField, mobileField, dobField;
    JTextArea addressArea;
    JRadioButton male, female;
    JCheckBox terms;
    JButton submit;

    RegistrationForm() {

        setTitle("Registration Form");
        setSize(400, 400);
        setLayout(new FlowLayout());

        // Name
        add(new JLabel("Name"));
        nameField = new JTextField(20);
        add(nameField);

        // Mobile
        add(new JLabel("Mobile"));
        mobileField = new JTextField(20);
        add(mobileField);

        // DOB
        add(new JLabel("Date of Birth"));
        dobField = new JTextField(20);
        add(dobField);

        // Address
        add(new JLabel("Address"));
        addressArea = new JTextArea(3, 20);
        add(addressArea);

        // Gender
        add(new JLabel("Gender"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        // Terms and Conditions
        terms = new JCheckBox("Please Accept the Terms and Conditions");
        add(terms);

        // Submit Button
        submit = new JButton("Submit");
        submit.addActionListener(this);
        add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (!terms.isSelected()) {
            JOptionPane.showMessageDialog(this,
                    "Please accept the terms and condition first");
            return;
        }

        try {
            FileWriter fw = new FileWriter("exam.txt", true);

            fw.write("Name: " + nameField.getText() + "\n");
            fw.write("Mobile: " + mobileField.getText() + "\n");
            fw.write("DOB: " + dobField.getText() + "\n");
            fw.write("Address: " + addressArea.getText() + "\n");

            if (male.isSelected()) {
                fw.write("Gender: Male\n");
            } else if (female.isSelected()) {
                fw.write("Gender: Female\n");
            }

            fw.write("-------------------------\n");
            fw.close();

            JOptionPane.showMessageDialog(this,
                    "Data Saved Successfully!");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}