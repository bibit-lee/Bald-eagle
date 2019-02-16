package jlayeredpanel.jlayered1;


import item.Panels;
import javax.swing.*;


public class C3Light {  //创建第一类第3层
    public static JPanel lightPanel;

    public JPanel light(){
        Panels panels=new Panels();
        lightPanel = panels.light();
        lightPanel.setVisible(false);

        return lightPanel;
    }

}
