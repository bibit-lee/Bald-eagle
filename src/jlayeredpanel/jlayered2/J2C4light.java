package jlayeredpanel.jlayered2;


import item.Panels;
import javax.swing.*;

public class J2C4light {
    public static JPanel lightPanel;

    public JPanel light(){
        Panels panels=new Panels();
        lightPanel = panels.light();
        lightPanel.setVisible(false);



        return lightPanel;
    }

}

