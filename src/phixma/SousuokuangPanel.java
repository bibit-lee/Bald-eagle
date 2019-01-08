package phixma;

import javax.swing.*;
import java.awt.*;

public class SousuokuangPanel extends JPanel{
    public JPanel SousuokuangPanel(){
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.YELLOW);
        JTextField jTextField=new JTextField("请输入搜索内容");
        ImageIcon icon=new ImageIcon("res/search.png");
        int icon_width=icon.getIconWidth();
        int icon_height=icon.getIconHeight();
        JButton jButton=new JButton(icon);
        SpringLayout springLayout=new SpringLayout();
        jPanel.setLayout(springLayout);
        jPanel.setSize(SousuoFrame.scr_width*46/100,SousuoFrame.scr_height*16/100);
        jButton.setSize(icon_width,icon_height);
        jTextField.setPreferredSize(new Dimension(SousuoFrame.scr_width*42/100,SousuoFrame.scr_height*6/100));
        jPanel.add(jTextField);
        jPanel.add(jButton);

        springLayout.putConstraint(SpringLayout.NORTH,jTextField,SousuoFrame.scr_height*5/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jTextField,SousuoFrame.scr_width*2/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,jButton,(SousuoFrame.scr_height-icon_height)/2,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jButton,0,SpringLayout.EAST,jTextField);
        springLayout.putConstraint(SpringLayout.EAST,jButton,SousuoFrame.scr_width*2/100,SpringLayout.EAST,jPanel);




        return jPanel;
    }
}
