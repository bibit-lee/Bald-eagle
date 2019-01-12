package phixma3;

import javax.swing.*;
import java.awt.*;

public class SearchFrame extends JFrame {
    JPanel j1;
    JPanel j2;
    JPanel j3;
    public SearchFrame(){
        JFrame jFrame=new JFrame();
        Spring v1ST=Spring.constant(50);

        Spring h1ST=Spring.constant(600);
        Container container=jFrame.getContentPane();

        jFrame.setExtendedState(MAXIMIZED_BOTH);
        SpringLayout springLayout=new SpringLayout();
        jFrame.setLayout(springLayout);
        SearchPanel s=new SearchPanel();
        j1=s.searchPanel();
        BrandResPanel b=new BrandResPanel();
        j2=b.brandResPanel();
        LocalResPanel l=new LocalResPanel();
        j3=l.localResPanel();


        springLayout.putConstraint(SpringLayout.NORTH,j1,v1ST,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,j1,v1ST,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,j1,-600,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,j2,30,SpringLayout.SOUTH,j1);
        springLayout.putConstraint(SpringLayout.WEST,j2,v1ST,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,j2,-600,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,j3,30,SpringLayout.SOUTH,j2);
        springLayout.putConstraint(SpringLayout.WEST,j3,v1ST,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,j3,-600,SpringLayout.EAST,container);


        container.add(j1);
        container.add(j2);
        container.add(j3);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new SearchFrame();
    }
}
