package item;

import javax.swing.*;
import java.awt.*;

public class Panels{

    public JPanel light(){
        JPanel jPanel=new JPanel();
        jPanel.setOpaque(false);
        jPanel.setLayout(null);
        JLabel light =new JLabel();
        light.setBackground(new Color(34,34,34,200));
        light.setOpaque(true);
        light.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);
        jPanel.add(light);

        return jPanel;   //返回面板实例对象
    }

}
