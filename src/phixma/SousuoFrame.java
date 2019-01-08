package phixma;

import javax.swing.*;
import java.awt.*;

public class SousuoFrame {
     static Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
     static int scr_width=(int)dimension.getWidth();
     static int scr_height=(int)dimension.getHeight();
     JPanel ssk;
     public SousuoFrame(){
         JFrame jFrame=new JFrame();
         jFrame.setLayout(null);
         jFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
         Container c=jFrame.getContentPane();
         SousuokuangPanel j1=new SousuokuangPanel();
         ssk=j1.SousuokuangPanel();
         ssk.setLocation(100,100);
         c.add(ssk);
         c.setVisible(true);
         jFrame.setVisible(true);


     }

    public static void main(String[] args) {
        new SousuoFrame();
    }

}
