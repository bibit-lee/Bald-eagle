package jlayeredpanel.jlayered2;


import item.ScreenSize;
import javax.swing.*;


public class J2C3EmptyPanel {
    public static JPanel j2C3Panel;
    public static JPanel clientOperation;
    public static JPanel commodityOperation;
    public JPanel getJ2C3Panel(){
        j2C3Panel=new JPanel();
        j2C3Panel.setLayout(null);

        J2C3OperationClient jp1=new J2C3OperationClient();
        clientOperation=jp1.getC3Info();
        clientOperation.setBounds(0,0, ScreenSize.scr_width*40/100,ScreenSize.scr_height);
        clientOperation.setVisible(false);

        J2C3OperationCommodity jp2=new J2C3OperationCommodity();
        commodityOperation=jp2.getC3Info();
        commodityOperation.setBounds(0,0, ScreenSize.scr_width*40/100,ScreenSize.scr_height);
        commodityOperation.setVisible(false);

        j2C3Panel.add(clientOperation);
        j2C3Panel.add(commodityOperation);
        return j2C3Panel;
    }
}
