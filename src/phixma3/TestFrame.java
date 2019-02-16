package phixma3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.Console;
import java.util.Calendar;

/**
 * Created by lb200 on 2019-01-24.
 */
public class TestFrame {
    long presstime;
    long releasetime;
    int x1;
    int x2;
    long t1;
    public TestFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
        Container container = jFrame.getContentPane();
        container.setLayout(null);



        JLabel jLabel = new JLabel("MOVE");
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.RED);
        jLabel.setBounds(100, 100, 100, 100);
        container.add(jLabel);
        jFrame.setVisible(true);




        container.addMouseMotionListener(new MouseAdapter() {

            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                jLabel.setLocation(e.getX(),100);
            }
        });
        container.addMouseListener(new MouseAdapter() {


            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                presstime = System.currentTimeMillis();
                x1=e.getX();
            }


            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                long releasetime = System.currentTimeMillis();
                x2=e.getX();
                int x=(x2-x1);
                t1=releasetime-presstime;
                int t2=(int)t1;
                int v=x/t2;
                int a=1;
                int t=v/a;
                int s=v*t+a*t*t/2;
                int sum=0;

                for (int i=0;i<1000;i++){

                }
            }
        });
    }

    public static void main(String[] args) {
        new TestFrame();
    }
}


