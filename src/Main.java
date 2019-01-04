//鼠标事件隐藏和显现效果

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public void mainPanel(){
        Dimension scrsize=Toolkit.getDefaultToolkit().getScreenSize();
        int scr_width=(int)scrsize.getWidth();
        int scr_height=(int)scrsize.getHeight();
        JFrame mainFrame=new JFrame();

        SpringLayout main_PanelLayout=new SpringLayout();
        JPanel main_Panel=new JPanel();
        main_Panel.setLayout(main_PanelLayout);

        mainFrame.setContentPane(main_Panel);
        mainFrame.setExtendedState(MAXIMIZED_BOTH);



        JLabel leftLabel=new JLabel("left");
        JLabel rightLabel=new JLabel("RIGHT");
        ImageIcon logo=new ImageIcon("C:\\Users\\dell\\IdeaProjects\\Blad eagle\\res\\logo.png");
        ImageIcon search=new ImageIcon("C:\\Users\\dell\\IdeaProjects\\Blad eagle\\res\\search.png");
        JLabel logoLabel=new JLabel(logo);
        JLabel emptyLabel=new JLabel("背景板");
        JLabel titleLabel=new JLabel("标题");
        JLabel search_logoLabel=new JLabel(search);

        leftLabel.setPreferredSize(new Dimension(scr_width/2,scr_height));


        leftLabel.setBackground(Color.RED);
        leftLabel.setOpaque(true);


        mainFrame.setVisible(true);


        main_PanelLayout.putConstraint(SpringLayout.NORTH,leftLabel,0,SpringLayout.NORTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,leftLabel,0,SpringLayout.WEST,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.SOUTH,leftLabel,0,SpringLayout.SOUTH,main_Panel);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,rightLabel,0,SpringLayout.NORTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.SOUTH,rightLabel,0,SpringLayout.SOUTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.EAST,rightLabel,0,SpringLayout.EAST,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,rightLabel,0,SpringLayout.EAST,leftLabel);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,logoLabel,500,SpringLayout.NORTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,leftLabel,500,SpringLayout.WEST,main_Panel);


        main_Panel.add(leftLabel);
        main_Panel.add(rightLabel);
        main_Panel.add(logoLabel);





    }

    public static void main(String[] args) {
        new Main().mainPanel();
    }
}
