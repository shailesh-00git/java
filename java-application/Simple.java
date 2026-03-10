import javax.swing.*;

public class Simple {

    // Constructor
    public Simple() {
        JFrame jframe = new JFrame("A simple swing app");
        jframe.setSize(200, 100);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("swing is powerful gui");
        jframe.add(jlab);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Simple();
            }
        });
    }
}