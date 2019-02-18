package jlayeredpanel.jlayered2;

import item.*;
import phixma.MainFrame;
import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class J2C3Operation {
    public static JPanel jPanel;
    public static JTable topTransaction6;
    public static JLabel exit;

    public JPanel getC3Info(){


        SpringLayout springLayout=new SpringLayout();
        jPanel=new JPanel(springLayout);
        jPanel.setOpaque(true);
        jPanel.setBackground(Color.WHITE);
        JLabel step1Label=new JLabel("第一步：快速选择客户",SwingConstants.CENTER);
        step1Label.setFont(Fonts.getFontH1Bold());

        exit=new JLabel("×",SwingConstants.CENTER);
        exit.setFont(Fonts.getSymbolHmax());
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Draw draw=new Draw();
        JPanel usersearch=draw.getUserSearchPanel();
        usersearch.setPreferredSize(new Dimension(ScreenSize.scr_width*40/100,ScreenSize.scr_height*12/100+2));

        TabelModels tabelModels=new TabelModels();
        topTransaction6=tabelModels.getClient();
        topTransaction6.setVisible(false);






        springLayout.putConstraint(SpringLayout.NORTH,step1Label,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,step1Label,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,exit,ScreenSize.scr_height/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,exit,-ScreenSize.scr_width*2/100,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,usersearch,0,SpringLayout.SOUTH,step1Label);
        springLayout.putConstraint(SpringLayout.WEST,usersearch,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,usersearch,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,topTransaction6,ScreenSize.scr_height*1/100,SpringLayout.SOUTH,usersearch);
        springLayout.putConstraint(SpringLayout.WEST,topTransaction6,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,topTransaction6,-ScreenSize.scr_width*2/100,SpringLayout.EAST,jPanel);
        springLayout.putConstraint(SpringLayout.SOUTH,topTransaction6,0,SpringLayout.SOUTH,jPanel);


        jPanel.add(step1Label);
        jPanel.add(exit);
        jPanel.add(usersearch);
        jPanel.add(topTransaction6);

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i=e.getButton();
                if (i==MouseEvent.BUTTON1) {
                    jPanel.setVisible(false);
                    topTransaction6.setVisible(false);
                    Jlayered2.c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100, ScreenSize.scr_width*40/100, ScreenSize.scr_height*24/100);
                    J2C4light.lightPanel.setVisible(false);
                    MainFrame.light.setVisible(false);
                }
            }
        });

        return jPanel;
    }
}
