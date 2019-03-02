package item.panels;


import item.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;

public class ClientSearchPanel {

    public static JLabel exit;
    public static JPanel userSearch;
    public static JTable topTransaction6;
    public static JPanel emptyPanel;

    public JPanel clientSearchPanel(){
        SpringLayout springLayout=new SpringLayout();
        JPanel jPanel=new JPanel(springLayout);
        JLabel step1Label=new JLabel("第一步：快速选择客户",SwingConstants.CENTER);
        step1Label.setFont(Fonts.getFontH1Bold());

        exit=new JLabel("×",SwingConstants.CENTER);
        exit.setFont(Fonts.getSymbolHmax());
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Draw draw=new Draw();
        userSearch=draw.getUserSearchPanel();
        userSearch.setPreferredSize(new Dimension(ScreenSize.scr_width*40/100,ScreenSize.scr_height*12/100+2));

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

        emptyPanel=new JPanel();
        emptyPanel.setLayout(null);
        emptyPanel.add(topTransaction6);

        springLayout.putConstraint(SpringLayout.NORTH,step1Label,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,step1Label,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,exit,ScreenSize.scr_height/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,exit,-ScreenSize.scr_width*2/100,SpringLayout.EAST,jPanel);


        springLayout.putConstraint(SpringLayout.NORTH,userSearch,0,SpringLayout.SOUTH,step1Label);
        springLayout.putConstraint(SpringLayout.WEST,userSearch,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,userSearch,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,emptyPanel,ScreenSize.scr_height/100,SpringLayout.SOUTH,userSearch);
        springLayout.putConstraint(SpringLayout.WEST,emptyPanel,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,emptyPanel,-ScreenSize.scr_width*2/100,SpringLayout.EAST,jPanel);
        springLayout.putConstraint(SpringLayout.SOUTH,emptyPanel,0,SpringLayout.SOUTH,jPanel);

        jPanel.add(step1Label);
        jPanel.add(exit);
        jPanel.add(userSearch);
        jPanel.add(emptyPanel);


        return jPanel;
    }
}
