import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class EventDemo {

    JLabel jlab = new JLabel();

    EventDemo() {

        JFrame jframe = new JFrame("JButton Demo");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(400, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jba = new JButton("Alpha");
        JButton jbb = new JButton("Beta");

        // Alpha button event
        jba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha was pressed");
            }
        });

        // Beta button event
        jbb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta was pressed");
            }
        });

        jframe.add(jba);
        jframe.add(jbb);
        jframe.add(jlab);

        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDemo();
            }
        });
    }
}