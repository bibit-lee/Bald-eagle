package item;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Labels {

    public static JLabel getTitleNameGuide(){
        JLabel jLabel=new JLabel("",SwingConstants.CENTER);
        jLabel.setForeground(new Color(255,185,15,255));
        jLabel.setPreferredSize(new Dimension(ScreenSize.scr_width*10/100,ScreenSize.scr_height*3/100));
        return jLabel;
    }
    public static JLabel getTitleName(){
        JLabel jLabel=new JLabel("",SwingConstants.CENTER);
        jLabel.setForeground(new Color(255,255,255,120));
        jLabel.setPreferredSize(new Dimension(ScreenSize.scr_width*6/100,ScreenSize.scr_height*3/100));
        return jLabel;
    }
    public static JLabel getRecommendSymbolIcon(){
        JLabel jLabel=new JLabel("",SwingConstants.CENTER);
        jLabel.setForeground(Color.WHITE);
        jLabel.setBackground(new Color(54,54,54,150));
        jLabel.setOpaque(true);
        jLabel.setPreferredSize(new Dimension(ScreenSize.scr_width*3/100,ScreenSize.scr_width*3/100));
        return jLabel;
    }
    public static JLabel getSelectSearchTitle(){
        JLabel jLabel=new JLabel("触控搜索",SwingConstants.CENTER);  //实例化搜索框标题文本
        return jLabel;
    }
    public static JLabel getKeybordSearchTitle(){
        JLabel jLabel=new JLabel("键入搜索",SwingConstants.CENTER);
        return jLabel;
    }


}
