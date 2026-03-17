import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class EventDemo implements ActionListener {

    JLabel jlab = new JLabel();

    EventDemo() {

        JFrame jframe = new JFrame("Btn event Demo");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(400, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jba = new JButton("Alpha");
        jba.setActionCommand("Alpha is clicked");
        jba.addActionListener(this);

        JButton jbb = new JButton("Beta");
        jbb.setActionCommand("Beta is clicked");
        jbb.addActionListener(this);
        // Alpha button event

        jframe.add(jba);
        jframe.add(jbb);
        jframe.add(jlab);

        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        jlab.setText(ae.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDemo();
            }
        });
    }
}