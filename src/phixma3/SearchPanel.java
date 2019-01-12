package phixma3;

import javax.swing.*;
import java.awt.*;

public class SearchPanel {


    public JPanel searchPanel(){

        SpringLayout springLayout=new SpringLayout();
        JPanel jPanel=new JPanel(springLayout);
        jPanel.setBackground(Color.green);
        jPanel.setPreferredSize(new Dimension(Item.searchPanel_widht,200));
        ImageIcon icon=new ImageIcon("res/search.png");
        int icon_width=icon.getIconWidth();
        int icon_height=icon.getIconHeight();

        JTextField jTextField=new JTextField("123");
        jTextField.setPreferredSize(new Dimension(500,icon_height));
        JButton jButton=new JButton(icon);
        jButton.setPreferredSize(new Dimension(icon_width,icon_height));
        springLayout.putConstraint(SpringLayout.NORTH,jTextField,50,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jTextField,50,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,jTextField,0,SpringLayout.WEST,jButton);

        springLayout.putConstraint(SpringLayout.NORTH,jButton,0,SpringLayout.NORTH,jTextField);
        springLayout.putConstraint(SpringLayout.EAST,jButton,-50,SpringLayout.EAST,jPanel);



        jPanel.add(jTextField);
        jPanel.add(jButton);

        return jPanel;
    }
}
