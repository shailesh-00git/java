
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class JtextFieldDemo {
    JtextFieldDemo() {
        JFrame jframe = new JFrame("J label demo");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(400, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField tf = new JTextField(15);

        jframe.add(tf);

        JLabel jlab = new JLabel();
        jframe.add(jlab);

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText(tf.getText());
            }
        });
        jframe.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JtextFieldDemo();
            }
        });
    }
}