import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class SwingDemo{
    SwingDemo(){
        JFrame jframe = new JFrame("A simple java application");
        jframe.setSize(400,500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("swing means powerful gui");
        jframe.add(jlab);
        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}