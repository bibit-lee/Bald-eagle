package phixma;

import javax.swing.*;
import java.awt.*;

public class TestFrame {
    JPanel j1;
    public TestFrame(){
        JFrame jFrame=new JFrame();
        Container cc=jFrame.getContentPane();
        jFrame.setSize(1000,1000);
        jFrame.setLayout(null);
        TestPanel testPanel=new TestPanel();
        j1=testPanel.TestPanel();
        cc.add(j1);
        cc.setBackground(Color.YELLOW);
        cc.setVisible(true);
        testPanel.setLocation(100,100);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new TestFrame();
    }
}
