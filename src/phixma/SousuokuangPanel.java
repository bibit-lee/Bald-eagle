package phixma;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SousuokuangPanel extends JPanel{
    public JPanel SousuokuangPanel(){
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.WHITE);
        JTextField jTextField=new JTextField();
        ImageIcon icon=new ImageIcon("res/search.png");
        int icon_width=icon.getIconWidth();
        int icon_height=icon.getIconHeight();
        JButton jButton=new JButton(icon);
        SpringLayout springLayout=new SpringLayout();
        jPanel.setLayout(springLayout);
        jPanel.setSize(SousuoFrame.scr_width*41/100+icon_width,SousuoFrame.scr_height*6/100);
        jButton.setPreferredSize(new Dimension(icon_width,icon_height));
        jButton.setBorder(new EmptyBorder(0,0,0,0));

        jTextField.setPreferredSize(new Dimension(SousuoFrame.scr_width*40/100,SousuoFrame.scr_height*4/100));
        jTextField.setBorder(new EmptyBorder(0,50,0,50));
        jTextField.setFont(new Font("微软雅黑",Font.BOLD,32));

        jPanel.add(jTextField);
        jPanel.add(jButton);

        springLayout.putConstraint(SpringLayout.NORTH,jTextField,SousuoFrame.scr_height*1/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jTextField,0,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,jButton,(SousuoFrame.scr_height*6/100-icon_height)/2,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jButton,0,SpringLayout.EAST,jTextField);
        springLayout.putConstraint(SpringLayout.EAST,jButton,-(SousuoFrame.scr_width*1/100),SpringLayout.EAST,jPanel);


        return jPanel;
    }
}
