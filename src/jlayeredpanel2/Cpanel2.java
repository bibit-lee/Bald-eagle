package jlayeredpanel2;

import javax.swing.*;
import java.awt.*;

public class Cpanel2 {
    public JLayeredPane Cpanel2(){
        JLayeredPane jLayeredPane=new JLayeredPane();
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setBounds(500,500,300,300);

        JPanel jPanel1=new JPanel();
        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setBounds(700,700,300,300);

        jLayeredPane.add(jPanel,Integer.valueOf(100));
        jLayeredPane.add(jPanel1,Integer.valueOf(200));

        return jLayeredPane;
    }
}
