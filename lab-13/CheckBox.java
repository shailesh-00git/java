import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBox implements ItemListener {
    JLabel jlab;

    CheckBox() {
        JFrame jframe = new JFrame("Check box demo");
        jframe.setLayout(new FlowLayout());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(250, 150);

        JCheckBox cb;

        cb = new JCheckBox("C++");
        cb.addItemListener(this);
        jframe.add(cb);

        cb = new JCheckBox("Java");
        cb.addItemListener(this);
        jframe.add(cb);

        cb = new JCheckBox("Perl");
        cb.addItemListener(this);
        jframe.add(cb);

        jlab = new JLabel("Select language");
        jframe.add(jlab);

        jframe.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        JCheckBox cb = (JCheckBox) ie.getItem();

        if (cb.isSelected())
            jlab.setText(cb.getText() + " is selected");
        else
            jlab.setText(cb.getText() + " is cleared");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CheckBox();
            }
        });
    }
}