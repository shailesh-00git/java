import javax.swing.*;
import java.awt.FlowLayout;

public class JLabelDemo {

    JLabelDemo() {
        // Create the main frame
        JFrame jframe = new JFrame("JLabel Demo");
        jframe.setLayout(new FlowLayout()); // Set FlowLayout
        jframe.setSize(400, 500); // Set window size
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load image and create JLabel
        ImageIcon ii = new ImageIcon("icon.png");
        JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);

        // Add label to frame
        jframe.add(jl);

        // Make frame visible
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure GUI runs on Event Dispatch Thread
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        new JLabelDemo();
                    }
                });
    }
}