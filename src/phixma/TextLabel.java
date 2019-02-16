package phixma;

import item.ScreenSize;
import javax.swing.*;
import java.awt.*;


public class TextLabel {

    public JLabel tuwenshangxia(){

        ImageIcon titlelogo=new ImageIcon("res/logo1.png");
        JLabel jLabel=new JLabel("",titlelogo,SwingConstants.CENTER);
        jLabel.setVerticalTextPosition(SwingConstants.TOP);
        jLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
        jLabel.setForeground(new Color(255,255,255,120));

        if (ScreenSize.scr_width>=2160){
            jLabel.setFont(new Font("Microsoft YaHei UI",Font.BOLD,32));
        }else if (ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){
            jLabel.setFont(new Font("Microsoft YaHei UI",Font.BOLD,24));
        }else if(ScreenSize.scr_width<1600){
            jLabel.setFont(new Font("Microsoft YaHei UI",Font.BOLD,20));
        }

        return jLabel;
    }

}
