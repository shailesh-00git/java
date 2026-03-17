import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class JbuttonDemo implements ActionListener {

    JLabel jlab;

    JbuttonDemo() {

        JFrame jframe = new JFrame("Button Events");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(350, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load only ONE image
        ImageIcon icon1 = new ImageIcon("images/facebook.png");
        ImageIcon icon2 = new ImageIcon("images/instagram.png");
        ImageIcon icon3 = new ImageIcon("images/whatsapp.png");

        // Create buttons using the same image
        JButton ficon = new JButton(icon1);
        ficon.setActionCommand("Facebook");
        ficon.addActionListener(this);

        JButton iicon = new JButton(icon2);
        iicon.setActionCommand("Instagram");
        iicon.addActionListener(this);

        JButton wicon = new JButton(icon3);
        wicon.setActionCommand("Whatsapp");
        wicon.addActionListener(this);

        // Add buttons to frame
        jframe.add(ficon);
        jframe.add(iicon);
        jframe.add(wicon);

        // Label
        jlab = new JLabel("Click a button");
        jframe.add(jlab);

        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        jlab.setText(ae.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JbuttonDemo();
            }
        });
    }
}