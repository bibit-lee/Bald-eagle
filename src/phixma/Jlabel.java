package phixma;
import javax.swing.*;
import java.awt.*;

public class  Jlabel {
    String la="";
    public static void main(String[] args) {

        JFrame f=new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel bel=new JLabel();
        f.add(bel);
        for (int i=0;i<100 ;i++ ) {
        String la=String.valueOf(i);
        bel.setText(la);
    }
        System.out.println("Hello World!");
    }
}
