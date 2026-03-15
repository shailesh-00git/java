import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class JbuttonDemo implements ActionListener {

    JLabel jlab; // class variable

    JbuttonDemo() {

        JFrame jframe = new JFrame("JButton Demo");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(400, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button 1
        ImageIcon ii = new ImageIcon("ico.png");
        JButton jbut1 = new JButton(ii);
        jbut1.setActionCommand("Videos");
        jbut1.addActionListener(this);
        jframe.add(jbut1);

        // Button 2
        ImageIcon ii0 = new ImageIcon("ico.png");
        JButton jbut2 = new JButton(ii0);
        jbut2.setActionCommand("MP4");
        jbut2.addActionListener(this);
        jframe.add(jbut2);

        // Button 3
        ImageIcon ii1 = new ImageIcon("ico.png");
        JButton jbut3 = new JButton(ii1);
        jbut3.setActionCommand("Music");
        jbut3.addActionListener(this);
        jframe.add(jbut3);

        JTextField tf = new JTextField(15);
        jframe.add(tf);

        jlab = new JLabel();
        jframe.add(jlab);

        jframe.setVisible(true);
    }

    // handle button click
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("Your text: " + ae.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JbuttonDemo();
            }
        });
    }
}