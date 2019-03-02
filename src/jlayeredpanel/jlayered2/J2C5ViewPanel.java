package jlayeredpanel.jlayered2;

import item.Fonts;
import item.ScreenSize;
import phixma.MainFrame;
import phixma.Title;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class J2C5ViewPanel {
    public static JPanel jPanel;
    //销售类变量
    public static JLabel clientNameLabel;
    public static JLabel clientContactLabel;
    public static JLabel clientAddressLabel;
    public static JLabel clientTelephoneLabel;
    public static JLabel clientNameTitle;
    public static JLabel contactsTitle;
    public static JLabel addressTitle;
    public static JLabel choiceLabel;
    public static JLabel selectClient;
    public static JLabel selectCommodity;

    public JPanel getJ2C5ViewSells(){
        SpringLayout springLayout=new SpringLayout();
        jPanel=new JPanel(springLayout);

        /*销售下单界面*/
        //1、页头标题标签
        JLabel newSellsLabel=new JLabel("销售开单",SwingConstants.CENTER);
        newSellsLabel.setFont(Fonts.getFontH1Bold());

        //2、打印/分享栏面板
        JPanel functionTitlePanel=new JPanel();
        functionTitlePanel.setPreferredSize(new Dimension(0,ScreenSize.scr_height*6/100));
        functionTitlePanel.setBackground(Color.orange);

        //3、客户信息面板
        SpringLayout clientInfoLayout=new SpringLayout();
        JPanel clientInfoPanel=new JPanel(clientInfoLayout);
        clientInfoPanel.setPreferredSize(new Dimension(0,ScreenSize.scr_height*14/100));
        clientInfoPanel.setBackground(Color.PINK);

        selectClient=new JLabel("选择客户",SwingConstants.CENTER);
        selectClient.setFont(Fonts.getFontH2Bold());
        selectClient.setOpaque(true);
        selectClient.setVisible(false);
        selectClient.setPreferredSize(new Dimension(ScreenSize.scr_width*10/100,ScreenSize.scr_height*6/100));

        clientNameTitle=new JLabel();
        clientNameTitle.setFont(Fonts.getFontStandard());
        contactsTitle=new JLabel();
        contactsTitle.setFont(Fonts.getFontStandard());
        addressTitle=new JLabel();
        addressTitle.setFont(Fonts.getFontStandard());

        clientNameLabel=new JLabel();
        clientNameLabel.setFont(Fonts.getFontStandard());
        clientContactLabel=new JLabel();
        clientContactLabel.setFont(Fonts.getFontStandard());
        clientAddressLabel=new JLabel();
        clientAddressLabel.setFont(Fonts.getFontStandard());
        clientTelephoneLabel=new JLabel();
        clientTelephoneLabel.setFont(Fonts.getFontStandard());

        choiceLabel=new JLabel("",SwingConstants.CENTER);
        choiceLabel.setFont(Fonts.getSymbolH0());

        clientInfoPanel.add(selectClient);
        clientInfoPanel.add(clientNameTitle);
        clientInfoPanel.add(contactsTitle);
        clientInfoPanel.add(addressTitle);
        clientInfoPanel.add(clientNameLabel);
        clientInfoPanel.add(clientContactLabel);
        clientInfoPanel.add(clientAddressLabel);
        clientInfoPanel.add(clientTelephoneLabel);
        clientInfoPanel.add(choiceLabel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,selectClient,ScreenSize.scr_height*4/100,SpringLayout.NORTH,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.WEST,selectClient,ScreenSize.scr_width*25/100,SpringLayout.WEST,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.EAST,selectClient,-ScreenSize.scr_width*25/100,SpringLayout.EAST,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.SOUTH,selectClient,-ScreenSize.scr_height*4/100,SpringLayout.SOUTH,clientInfoPanel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,clientNameTitle,ScreenSize.scr_height*2/100,SpringLayout.NORTH,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.WEST,clientNameTitle,ScreenSize.scr_width*10/100,SpringLayout.WEST,clientInfoPanel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,contactsTitle,ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientNameTitle);
        clientInfoLayout.putConstraint(SpringLayout.WEST,contactsTitle,ScreenSize.scr_width*10/100,SpringLayout.WEST,clientInfoPanel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,addressTitle,ScreenSize.scr_height*2/100,SpringLayout.SOUTH,contactsTitle);
        clientInfoLayout.putConstraint(SpringLayout.WEST,addressTitle,ScreenSize.scr_width*10/100,SpringLayout.WEST,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.SOUTH,addressTitle,-ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientInfoPanel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,clientNameLabel,ScreenSize.scr_height*2/100,SpringLayout.NORTH,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.WEST,clientNameLabel,0,SpringLayout.EAST,clientNameTitle);
        clientInfoLayout.putConstraint(SpringLayout.EAST,clientNameLabel,0,SpringLayout.WEST,choiceLabel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,clientContactLabel,ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientNameLabel);
        clientInfoLayout.putConstraint(SpringLayout.WEST,clientContactLabel,0,SpringLayout.EAST,contactsTitle);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,clientTelephoneLabel,ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientNameLabel);
        clientInfoLayout.putConstraint(SpringLayout.WEST,clientTelephoneLabel,ScreenSize.scr_width*2/100,SpringLayout.EAST,clientContactLabel);
        clientInfoLayout.putConstraint(SpringLayout.EAST,clientTelephoneLabel,0,SpringLayout.WEST,choiceLabel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,clientAddressLabel,ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientTelephoneLabel);
        clientInfoLayout.putConstraint(SpringLayout.WEST,clientAddressLabel,0,SpringLayout.EAST,addressTitle);
        clientInfoLayout.putConstraint(SpringLayout.EAST,clientAddressLabel,0,SpringLayout.WEST,choiceLabel);
        clientInfoLayout.putConstraint(SpringLayout.SOUTH,clientAddressLabel,-ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientInfoPanel);

        clientInfoLayout.putConstraint(SpringLayout.NORTH,choiceLabel,ScreenSize.scr_height*2/100,SpringLayout.NORTH,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.EAST,choiceLabel,-ScreenSize.scr_width*10/100,SpringLayout.EAST,clientInfoPanel);
        clientInfoLayout.putConstraint(SpringLayout.SOUTH,choiceLabel,-ScreenSize.scr_height*2/100,SpringLayout.SOUTH,clientInfoPanel);



        //4、商品明细面板

        JPanel inventoryPanel=new JPanel(new FlowLayout(FlowLayout.CENTER,30,30));

        inventoryPanel.setPreferredSize(new Dimension(0,ScreenSize.scr_height*30/100));
        inventoryPanel.setBackground(Color.GRAY);


        selectCommodity=new JLabel("选择商品",SwingConstants.CENTER);
        selectCommodity.setFont(Fonts.getFontH2Bold());
        selectCommodity.setOpaque(true);
        selectCommodity.setVisible(false);
        selectCommodity.setPreferredSize(new Dimension(ScreenSize.scr_width*10/100,ScreenSize.scr_height*6/100));
        selectCommodity.setHorizontalAlignment(SwingConstants.CENTER);

        JTable inventoryTable=new JTable();

        inventoryPanel.add(selectCommodity);



        //5、操作方式面板
        JPanel operationPanel=new JPanel();


        //3、客户信息面板--监听
        choiceLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                J2C4light.lightPanel.setVisible(true);
                MainFrame.light.setVisible(true);
                Title.j1_Order.setForeground(new Color(255,255,255,255));
                J2C3OperationClient.jPanel.setVisible(true);
                J2C3OperationClient.emptyPanel.setVisible(false);
                MainFrame.jlpn1.setVisible(false);
                MainFrame.jlpn2.setVisible(true);

            }
        });
        selectClient.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                J2C4light.lightPanel.setVisible(true);
                MainFrame.light.setVisible(true);
                Title.j1_Order.setForeground(new Color(255,255,255,255));
                J2C3EmptyPanel.j2C3Panel.setVisible(true);
                J2C3OperationClient.jPanel.setVisible(true);
                J2C3OperationClient.emptyPanel.setVisible(false);
                MainFrame.jlpn1.setVisible(false);
                MainFrame.jlpn2.setVisible(true);

            }
        });

        //4、商品明细面板--监听
        selectCommodity.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                J2C4light.lightPanel.setVisible(true);
                MainFrame.light.setVisible(true);
                Title.j1_Order.setForeground(new Color(255,255,255,255));
                J2C3EmptyPanel.j2C3Panel.setVisible(true);
                J2C3OperationClient.jPanel.setVisible(false);
                J2C3OperationCommodity.jPanel.setVisible(true);
                J2C3OperationCommodity.emptyPanel.setVisible(false);
                MainFrame.jlpn1.setVisible(false);
                MainFrame.jlpn2.setVisible(true);

            }
        });


        jPanel.add(newSellsLabel);
        jPanel.add(functionTitlePanel);
        jPanel.add(clientInfoPanel);
        jPanel.add(inventoryPanel);
        jPanel.add(operationPanel);

        springLayout.putConstraint(SpringLayout.NORTH,newSellsLabel,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,newSellsLabel,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,newSellsLabel,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,functionTitlePanel,0,SpringLayout.SOUTH,newSellsLabel);
        springLayout.putConstraint(SpringLayout.WEST,functionTitlePanel,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,functionTitlePanel,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,clientInfoPanel,0,SpringLayout.SOUTH,functionTitlePanel);
        springLayout.putConstraint(SpringLayout.WEST,clientInfoPanel,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,clientInfoPanel,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,inventoryPanel,0,SpringLayout.SOUTH,clientInfoPanel);
        springLayout.putConstraint(SpringLayout.WEST,inventoryPanel,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,inventoryPanel,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,operationPanel,0,SpringLayout.SOUTH,inventoryPanel);
        springLayout.putConstraint(SpringLayout.WEST,operationPanel,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,operationPanel,0,SpringLayout.EAST,jPanel);

        return jPanel;
    }

}
