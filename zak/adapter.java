import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 1. We extend JFrame directly to make things simpler
class MouseAdapterExample extends JFrame { 
    
    public MouseAdapterExample() {
        // 2. Standard JFrame setup
        setTitle("Mouse Adapter Example");
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click anywhere in the window");
        add(label);

        // 3. Add the listener to 'this' (the current JFrame)
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // This updates the label on the screen
                label.setText("Mouse Clicked at: " + e.getX() + "," + e.getY());
                // This prints to your console/terminal
                System.out.println("Mouse Clicked at: " + e.getX() + "," + e.getY());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run on the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new MouseAdapterExample());
    }
}