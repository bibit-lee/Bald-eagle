package phixma;

import javax.swing.*;
import java.awt.*;

public class View extends JPanel {

    JPanel panel = new JPanel();
    JLabel label;
    JLabel labels[];
    JButton b1 = new JButton("OK");

    public View() {
        this.setLayout(new FlowLayout());
        this.add(panel); // adding a new JPanel
        label = new JLabel("My label");
        panel.add(label);  // adding label to the new panel (this one works)
    }


    public void showLabels() {
        System.out.println("function showLabels called");

        labels = new JLabel[99];

        for (int i = 0; i < 99; i++) {
            labels[i] = new JLabel("Label: " + i);
            panel.add(labels[i]); // this one doesn't work
        }
        panel.add(b1); // this one doesn't work, too
        this.validate(); // validating this class (parent container)
        panel.validate(); // validating the panel, where all the components are
    }
}
