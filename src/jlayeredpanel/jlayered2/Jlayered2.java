package jlayeredpanel.jlayered2;


import item.ScreenSize;
import javax.swing.*;


public class Jlayered2 {
    public static JPanel c3Info;
    public JLayeredPane jLayeredPane(){
        JLayeredPane jLayeredPane=new JLayeredPane();

        J2C3Operation c3=new J2C3Operation();
        c3Info=c3.getC3Info();
        c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100, ScreenSize.scr_width*40/100, ScreenSize.scr_height*24/100);

        J2C4light c4=new J2C4light();
        JPanel j2c4Light=c4.light();
        j2c4Light.setBounds(0,0, ScreenSize.scr_width, ScreenSize.scr_height);

        J2C5ViewPanel c5=new J2C5ViewPanel();
        JPanel j2c5ViewPanel=c5.getJ2C5View();
        j2c5ViewPanel.setBounds(ScreenSize.scr_width*20/100, ScreenSize.scr_height*5/100, ScreenSize.scr_width*60/100, ScreenSize.scr_height*70/100);



        jLayeredPane.add(c3Info,Integer.valueOf(300));
        jLayeredPane.add(j2c4Light,Integer.valueOf(200));
        jLayeredPane.add(j2c5ViewPanel,Integer.valueOf(100));

        return jLayeredPane;
    }
}
