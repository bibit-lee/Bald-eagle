package phixma;


import javax.swing.*;
import java.awt.*;

public class MainSearch_Panel {
    static JTextField mainSearchField;
    public MainSearch_Panel(){

        SpringLayout springLayout=new SpringLayout();
        ImageIcon icon=new ImageIcon("res/search1.jpg");
        ImageIcon logo=new ImageIcon("res/logo1.jpg");
        int icon_width=icon.getIconWidth();
        int icon_height=icon.getIconHeight();
        JPanel jPanel=new JPanel(springLayout);
        jPanel.setBackground(Color.GREEN);
        jPanel.setSize(SizeScreen.MainSearch_Panel_width,200);



        JButton jButton=new JButton(icon);
        jButton.setPreferredSize(new Dimension(icon_width,icon_height));
        mainSearchField.setSize((SizeScreen.MainSearch_Panel_width),200);

    }
}
