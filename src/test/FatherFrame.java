package test;

import javax.swing.*;
import java.awt.*;

public class FatherFrame {
    JFrame jFrame=new JFrame();
    Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
    int scr_width=(int)dimension.getWidth();
    int scr_height=(int)dimension.getHeight();


    public FatherFrame(){
        jFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
        jFrame.getContentPane().setBackground(new Color(105,105,105));
        jFrame.setVisible(true);
    }
    public void FatheFrame_B(){
        ImageIcon icon=new ImageIcon("res/pic.jpg");
        JLabel jLabel=new JLabel(icon);
        JPanel jPanel=new JPanel();
        jPanel.add(jLabel);
        jPanel.setOpaque(false);
        jPanel.setLayout(null);
        jLabel.setBounds(0,0,scr_width,scr_height);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new FatherFrame();
    }
}
