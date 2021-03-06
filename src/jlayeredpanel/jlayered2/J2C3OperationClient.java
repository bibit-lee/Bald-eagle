package jlayeredpanel.jlayered2;

import item.*;
import phixma.MainFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;


public class J2C3OperationClient {
    public static JPanel jPanel;
    public static JPanel emptyPanel;
    public static JTable topTransaction6;
    public static JLabel exit;
    public static JPanel usersearch;

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
        usersearch=draw.getUserSearchPanel();
        usersearch.setPreferredSize(new Dimension(ScreenSize.scr_width*40/100,ScreenSize.scr_height*12/100+2));


        DefaultTableModel tableModel=new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"col0","col1","col2","col3"});//设置类名
        Res res=new Res();
        ResultSet topTransaction6Res=res.gettopTransaction6();
        try{
            while (topTransaction6Res.next()){
                String ClientName=topTransaction6Res.getString("ClientName");
                String Contacts=topTransaction6Res.getString("Contacts");
                String Telephone=topTransaction6Res.getString("Telephone");
                String Address=topTransaction6Res.getString("Address");
                tableModel.addRow(new Object[]{ClientName,Contacts,Telephone,Address});
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Tables t=new Tables();
        topTransaction6=t.clientSearchTable(tableModel);
        topTransaction6.setBounds(0,0,ScreenSize.scr_width*40/100,ScreenSize.scr_height);
        topTransaction6.setVisible(false);
        emptyPanel=new JPanel();
        emptyPanel.setLayout(null);
        emptyPanel.setBackground(Color.WHITE);
        emptyPanel.add(topTransaction6);



        springLayout.putConstraint(SpringLayout.NORTH,step1Label,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,step1Label,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,exit,ScreenSize.scr_height/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,exit,-ScreenSize.scr_width*2/100,SpringLayout.EAST,jPanel);


        springLayout.putConstraint(SpringLayout.NORTH,usersearch,0,SpringLayout.SOUTH,step1Label);
        springLayout.putConstraint(SpringLayout.WEST,usersearch,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,usersearch,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,emptyPanel,ScreenSize.scr_height/100,SpringLayout.SOUTH,usersearch);
        springLayout.putConstraint(SpringLayout.WEST,emptyPanel,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,emptyPanel,-ScreenSize.scr_width*2/100,SpringLayout.EAST,jPanel);
        springLayout.putConstraint(SpringLayout.SOUTH,emptyPanel,0,SpringLayout.SOUTH,jPanel);



        jPanel.add(step1Label);
        jPanel.add(exit);
        jPanel.add(usersearch);
        jPanel.add(emptyPanel);




        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i=e.getButton();
                if (i==MouseEvent.BUTTON1) {

                    Jlayered2.c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100, ScreenSize.scr_width*40/100, ScreenSize.scr_height*24/100);
                    J2C4light.lightPanel.setVisible(false);
                    MainFrame.light.setVisible(false);

                    J2C5ViewPanel.selectClient.setVisible(true);
                    J2C5ViewPanel.clientNameLabel.setText("");
                    J2C5ViewPanel.clientContactLabel.setText("");
                    J2C5ViewPanel.clientTelephoneLabel.setText("");
                    J2C5ViewPanel.clientAddressLabel.setText("");
                    J2C5ViewPanel.clientNameTitle.setText("");
                    J2C5ViewPanel.contactsTitle.setText("");
                    J2C5ViewPanel.addressTitle.setText("");
                    J2C5ViewPanel.choiceLabel.setText("");



                    emptyPanel.setVisible(false);
                    J2C3EmptyPanel.j2C3Panel.setVisible(false);
                }
            }
        });

        return jPanel;
    }
}
