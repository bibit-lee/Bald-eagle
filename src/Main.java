//鼠标事件隐藏和显现效果

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.*;

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




        JLabel rightLabel=new JLabel("RIGHT");
        ImageIcon logo=new ImageIcon("C:res\\logo.png");
        ImageIcon search=new ImageIcon("C:res\\search.png");
        JLabel leftNorth_Label=new JLabel("LEFT_NOTTH");
        JLabel leftWest_Label=new JLabel("LEFT_WEST");
        JLabel leftEast_Label=new JLabel("LEFT_EAST");
        JLabel leftSouth_Label=new JLabel("LEFT_SOUT");
        JLabel logoLabel=new JLabel(logo);
        JLabel emptyLabel=new JLabel("背景板");
        JLabel titleLabel=new JLabel("标题");
        JLabel search_logoLabel=new JLabel(search);

        leftNorth_Label.setPreferredSize(new Dimension(scr_width/2,300));
        emptyLabel.setPreferredSize(new Dimension(570,370));
        logoLabel.setVisible(false);
        logoLabel.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        mainFrame.setVisible(true);

        titleLabel.setPreferredSize(new Dimension(300,100));
        titleLabel.setVisible(false);




        main_PanelLayout.putConstraint(SpringLayout.NORTH,titleLabel,300,SpringLayout.NORTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,titleLabel,150,SpringLayout.WEST,main_Panel);



        main_PanelLayout.putConstraint(SpringLayout.NORTH,leftNorth_Label,0,SpringLayout.NORTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,leftNorth_Label,0,SpringLayout.WEST,main_Panel);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,leftWest_Label,0,SpringLayout.SOUTH,leftNorth_Label);
        main_PanelLayout.putConstraint(SpringLayout.WEST,leftWest_Label,0,SpringLayout.WEST,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.SOUTH,leftWest_Label,0,SpringLayout.NORTH,leftSouth_Label);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,logoLabel,0,SpringLayout.SOUTH,leftNorth_Label);
        main_PanelLayout.putConstraint(SpringLayout.WEST,logoLabel,0,SpringLayout.EAST,leftWest_Label);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,leftEast_Label,0,SpringLayout.SOUTH,leftNorth_Label);
        main_PanelLayout.putConstraint(SpringLayout.WEST,leftEast_Label,0,SpringLayout.EAST,logoLabel);
        main_PanelLayout.putConstraint(SpringLayout.EAST,leftEast_Label,0,SpringLayout.WEST,rightLabel);
        main_PanelLayout.putConstraint(SpringLayout.SOUTH,leftEast_Label,0,SpringLayout.NORTH,leftSouth_Label);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,leftSouth_Label,0,SpringLayout.SOUTH,logoLabel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,leftSouth_Label,0,SpringLayout.WEST,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.SOUTH,leftSouth_Label,0,SpringLayout.SOUTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.EAST,leftSouth_Label,0,SpringLayout.WEST,rightLabel);

        main_PanelLayout.putConstraint(SpringLayout.NORTH,rightLabel,0,SpringLayout.NORTH,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.WEST,rightLabel,0,SpringLayout.EAST,leftNorth_Label);
        main_PanelLayout.putConstraint(SpringLayout.EAST,rightLabel,0,SpringLayout.EAST,main_Panel);
        main_PanelLayout.putConstraint(SpringLayout.SOUTH,rightLabel,0,SpringLayout.SOUTH,main_Panel);


        main_Panel.add(leftNorth_Label);
        main_Panel.add(leftWest_Label);
        main_Panel.add(leftEast_Label);
        main_Panel.add(leftSouth_Label);
        main_Panel.add(rightLabel);
        main_Panel.add(emptyLabel);
        main_Panel.add(titleLabel);
        main_Panel.add(logoLabel);

        leftNorth_Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                logoLabel.setVisible(true);
                logoLabel.setBackground(new Color(245,245,245,100));

            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                logoLabel.setVisible(false);
            }
        });
        leftWest_Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                logoLabel.setVisible(true);
                logoLabel.setBackground(new Color(245,245,245,100));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                logoLabel.setVisible(false);
            }
        });
        leftEast_Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                logoLabel.setVisible(true);
                logoLabel.setBackground(new Color(245,245,245,100));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                logoLabel.setVisible(false);
            }
        });
        leftSouth_Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                logoLabel.setVisible(true);
                logoLabel.setBackground(new Color(245,245,245,100));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                logoLabel.setVisible(false);
            }
        });

        logoLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                logoLabel.setVisible(true);

                logoLabel.setBorder(BorderFactory.createLineBorder(Color.RED,1));
                titleLabel.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                logoLabel.setBorder(new EmptyBorder(20,20,20,20));
                titleLabel.setVisible(false);
            }
        });

    }
    public static void main(String[] args) {
        new Main().mainPanel();
    }
}
