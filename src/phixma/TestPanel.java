package phixma;

import javax.swing.*;
import java.awt.*;

public class TestPanel extends JPanel {
    public JPanel TestPanel(){
        JPanel jPanel=new JPanel();
        jPanel.setSize(300,300);
        jPanel.setBackground(Color.red);
        jPanel.setOpaque(true);
        jPanel.setVisible(true);
        return jPanel;
    }
}
