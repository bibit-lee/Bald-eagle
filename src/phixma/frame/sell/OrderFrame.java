package phixma.frame.sell;


import item.Fonts;
import item.Panels;
import item.ScreenSize;
import item.panels.ClientInfoPanel;
import item.panels.ClientSearchPanel;
import item.panels.DetailPanel;
import item.panels.SharePanel;
import jdk.nashorn.internal.scripts.JD;
import jlayeredpanel.jlayered1.C2MainSearchPanel_2700;
import jlayeredpanel.jlayered1.C3Light;
import phixma.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderFrame extends JFrame {
    public static JFrame jFrame;
    public static JPanel lightPanel;

    class ClientSearchDialog extends JDialog{
        public ClientSearchDialog(OrderFrame jFrame){
            super(jFrame);
            Container container=getContentPane();
            ClientSearchPanel clientSearchPanel=new ClientSearchPanel();
            JPanel jPanel=clientSearchPanel.clientSearchPanel();
            container.add(jPanel);
            setBounds(200,200,200,200);

        }
    }


    public OrderFrame(){
        jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setUndecorated(true);
        Container container=jFrame.getContentPane();
        SpringLayout springLayout=new SpringLayout();
        container.setLayout(springLayout);
        jFrame.setBounds(ScreenSize.scr_width*10/100,ScreenSize.scr_height*12/100,ScreenSize.scr_width*80/100,ScreenSize.scr_height*80/100);

        Panels panels=new Panels();
        lightPanel=panels.light();
        lightPanel.setVisible(false);

        /*销售下单界面*/
        //1、关闭栏按钮
        JLabel exit=new JLabel("×",SwingConstants.CENTER);
        exit.setPreferredSize(new Dimension(ScreenSize.scr_width*2/100,ScreenSize.scr_height*4/100));
        exit.setFont(Fonts.getSymbolHmax());
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //2、1 页头标题标签
        JLabel sellTitle=new JLabel("销售开单",SwingConstants.LEFT);
        sellTitle.setPreferredSize(new Dimension(ScreenSize.scr_width*27/100,ScreenSize.scr_height*10/100));
        sellTitle.setFont(Fonts.getFontH1Bold());
        sellTitle.setBackground(Color.YELLOW);
        sellTitle.setOpaque(true);


        //2、2 打印/分享栏面板
        SharePanel sp=new SharePanel();
        JPanel functionTitlePanel=new JPanel();
        functionTitlePanel.setPreferredSize(new Dimension(ScreenSize.scr_width*27/100,ScreenSize.scr_height*10/100));
        functionTitlePanel.setBackground(Color.orange);

        //2、3 总计数量面板
        JPanel total=new JPanel();
        total.setPreferredSize(new Dimension(ScreenSize.scr_width*26/100,ScreenSize.scr_height*10/100));
        total.setBackground(Color.BLUE);
        total.setOpaque(true);

        //3、1 商品明细面板
        DetailPanel d=new DetailPanel();
        JPanel detailPanel=d.detailPanel();
        detailPanel.setPreferredSize(new Dimension(ScreenSize.scr_width*54/100,ScreenSize.scr_height*40/100));
        detailPanel.setBackground(Color.GRAY);
        detailPanel.setOpaque(true);

        //3、2 提交按钮标签
        JLabel submit=new JLabel("保存",SwingConstants.CENTER);
        submit.setFont(Fonts.getFontH1Bold());
        submit.setPreferredSize(new Dimension(ScreenSize.scr_width*26/100,ScreenSize.scr_height*10/100));
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.RED);
        submit.setOpaque(true);


        //3、3 单号、日期、销售者
        JPanel billInfo=new JPanel();
        billInfo.setPreferredSize(new Dimension(0,ScreenSize.scr_height*15/100));
        billInfo.setBackground(Color.green);
        billInfo.setOpaque(true);


        //3、4 客户信息面板
        ClientInfoPanel cip=new ClientInfoPanel();
        JPanel clientInfoPanel=cip.clientInfoPanel();
        clientInfoPanel.setPreferredSize(new Dimension(0,ScreenSize.scr_height*20/100));
        clientInfoPanel.setBackground(Color.orange);

        //3、5 选取客户按钮
        JLabel selectClient=new JLabel("选取客户",SwingConstants.CENTER);
        selectClient.setBackground(new Color(8,110,194));
        selectClient.setForeground(Color.WHITE);
        selectClient.setOpaque(true);
        selectClient.setFont(Fonts.getFontButtonBig());



        //4、获取清单
        JPanel achievePanel=new JPanel();
        achievePanel.setPreferredSize(new Dimension(ScreenSize.scr_width*54/100,ScreenSize.scr_height*10/100));


        //5、操作方式面板
        JPanel operationPanel=new JPanel();
        operationPanel.setPreferredSize(new Dimension(ScreenSize.scr_width*54/100,ScreenSize.scr_height*14/100));
        operationPanel.setBackground(Color.PINK);



        container.add(lightPanel);
        container.add(exit);
        container.add(sellTitle);
        container.add(functionTitlePanel);
        container.add(total);
        container.add(detailPanel);
        container.add(submit);
        container.add(billInfo);
        container.add(selectClient);
        container.add(clientInfoPanel);
        container.add(achievePanel);
        container.add(operationPanel);







        springLayout.putConstraint(SpringLayout.NORTH,lightPanel,0,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,lightPanel,0,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,lightPanel,0,SpringLayout.EAST,container);
        springLayout.putConstraint(SpringLayout.SOUTH,lightPanel,0,SpringLayout.SOUTH,container);

        springLayout.putConstraint(SpringLayout.NORTH,exit,ScreenSize.scr_height/100,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.EAST,exit,-ScreenSize.scr_width/100,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,sellTitle,0,SpringLayout.SOUTH,exit);
        springLayout.putConstraint(SpringLayout.WEST,sellTitle,ScreenSize.scr_width/100,SpringLayout.WEST,container);

        springLayout.putConstraint(SpringLayout.NORTH,functionTitlePanel,0,SpringLayout.SOUTH,exit);
        springLayout.putConstraint(SpringLayout.WEST,functionTitlePanel,0,SpringLayout.EAST,sellTitle);

        springLayout.putConstraint(SpringLayout.NORTH,total,0,SpringLayout.SOUTH,exit);
        springLayout.putConstraint(SpringLayout.WEST,total,0,SpringLayout.EAST,functionTitlePanel);
        springLayout.putConstraint(SpringLayout.EAST,total,-ScreenSize.scr_width/100,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,detailPanel,0,SpringLayout.SOUTH,sellTitle);
        springLayout.putConstraint(SpringLayout.WEST,detailPanel,ScreenSize.scr_width/100,SpringLayout.WEST,container);

        springLayout.putConstraint(SpringLayout.NORTH,submit,0,SpringLayout.SOUTH,total);
        springLayout.putConstraint(SpringLayout.WEST,submit,ScreenSize.scr_width*10/100,SpringLayout.EAST,detailPanel);
        springLayout.putConstraint(SpringLayout.EAST,submit,-ScreenSize.scr_width/100,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,billInfo,0,SpringLayout.SOUTH,submit);
        springLayout.putConstraint(SpringLayout.WEST,billInfo,0,SpringLayout.EAST,detailPanel);
        springLayout.putConstraint(SpringLayout.EAST,billInfo,-ScreenSize.scr_width/100,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,clientInfoPanel,0,SpringLayout.SOUTH,billInfo);
        springLayout.putConstraint(SpringLayout.WEST,clientInfoPanel,0,SpringLayout.EAST,detailPanel);
        springLayout.putConstraint(SpringLayout.EAST,clientInfoPanel,-ScreenSize.scr_width/100,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,achievePanel,0,SpringLayout.SOUTH,detailPanel);
        springLayout.putConstraint(SpringLayout.WEST,achievePanel,ScreenSize.scr_width/100,SpringLayout.WEST,container);



        springLayout.putConstraint(SpringLayout.NORTH,operationPanel,0,SpringLayout.SOUTH,achievePanel);
        springLayout.putConstraint(SpringLayout.WEST,operationPanel,ScreenSize.scr_width/100,SpringLayout.WEST,container);

        springLayout.putConstraint(SpringLayout.NORTH,selectClient,ScreenSize.scr_height*7/100,SpringLayout.NORTH,clientInfoPanel);
        springLayout.putConstraint(SpringLayout.WEST,selectClient,ScreenSize.scr_width*7/100,SpringLayout.WEST,clientInfoPanel);
        springLayout.putConstraint(SpringLayout.EAST,selectClient,-ScreenSize.scr_width*7/100,SpringLayout.EAST,clientInfoPanel);
        springLayout.putConstraint(SpringLayout.SOUTH,selectClient,-ScreenSize.scr_height*7/100,SpringLayout.SOUTH,clientInfoPanel);



        selectClient.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i=e.getButton();
                if (i==MouseEvent.BUTTON1){
                    new ClientSearchDialog(OrderFrame.this).setVisible(true);

                }
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i=e.getButton();
                if (i==MouseEvent.BUTTON1){
                    MainFrame.jFrame.setEnabled(true);
                    jFrame.dispose();
                    C2MainSearchPanel_2700.jPanel.setVisible(true);
                    MainFrame.light.setVisible(false);
                    C3Light.lightPanel.setVisible(false);

                }
            }
        });

        jFrame.setVisible(true);

    }


    public static void main(String[] args) {
        new OrderFrame();

    }

}
