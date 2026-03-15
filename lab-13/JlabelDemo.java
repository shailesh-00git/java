
import javax.swing.*;
import java.awt.FlowLayout;

class JlabelDemo {
    JlabelDemo() {
        JFrame jframe = new JFrame("J label demo");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(400, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon ii = new ImageIcon("ico.png");
        JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);

        jframe.add(jl);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JlabelDemo();
            }
        });
    }
}