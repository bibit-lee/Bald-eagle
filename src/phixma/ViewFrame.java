package phixma;

import javax.swing.*;
import java.awt.*;

public class ViewFrame {

    public ViewFrame(){
        JFrame jFrame=new JFrame();
        jFrame.setSize(1500,1200);
        Container c=jFrame.getContentPane();
        View v=new View();
        v.showLabels();
        c.add(v);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewFrame();
    }
}
