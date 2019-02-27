package phixma;

import item.*;
import jlayeredpanel.jlayered1.C3Light;
import jlayeredpanel.jlayered2.J2C3Operation;
import jlayeredpanel.jlayered2.J2C4light;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Title {  //创建主窗体菜单类
    //创建菜单面板实例方法
    public JPanel title(){

        SpringLayout springLayout=new SpringLayout();   //实例化弹簧布局管理器

        JLabel j1Sell=Labels.getTitleName();
        j1Sell.setFont(Fonts.getFontH2Bold());
        j1Sell.setText("销售");


        JLabel j2Purchase=Labels.getTitleName();
        j2Purchase.setFont(Fonts.getFontH2Bold());
        j2Purchase.setText("采购");

        JLabel j3Depot=Labels.getTitleName();
        j3Depot.setFont(Fonts.getFontH2Bold());
        j3Depot.setText("仓库");

        JLabel j4Finance=Labels.getTitleName();
        j4Finance.setFont(Fonts.getFontH2Bold());
        j4Finance.setText("财务");

        JLabel j5Manage=Labels.getTitleName();
        j5Manage.setFont(Fonts.getFontH2Bold());
        j5Manage.setText("系统控制");

        JLabel j6Life=Labels.getTitleName();
        j6Life.setFont(Fonts.getFontH2Bold());
        j6Life.setText("生活优品");


        JLabel exittitle=Labels.getTitleName();
        exittitle.setFont(Fonts.getFontH2Bold());
        exittitle.setText("退出");
        exittitle.setForeground(new Color(255,255,255,255));

        JLabel j1_title=Labels.getTitleNameGuide();
        j1_title.setFont(Fonts.getFontH1Bold());
        j1_title.setText("销售权限");



        JLabel j1_Order=Labels.getTitleName();
        j1_Order.setFont(Fonts.getFontH2Bold());
        j1_Order.setText("开单");

        JLabel j1_SalesSlip=Labels.getTitleName();
        j1_SalesSlip.setFont(Fonts.getFontH2Bold());
        j1_SalesSlip.setText("销售单");

        JLabel j1_SalesQuotation=Labels.getTitleName();
        j1_SalesQuotation.setFont(Fonts.getFontH2Bold());
        j1_SalesQuotation.setText("销售报价");

        JLabel j1_SalesStatistics=Labels.getTitleName();
        j1_SalesStatistics.setFont(Fonts.getFontH2Bold());
        j1_SalesStatistics .setText("销售统计");


        JPanel jPanel=new JPanel(springLayout);  //实例化面板类对象，设置为弹簧布局
        jPanel.setBackground(new Color(247,68,97,0));  //设置面板背景色和透明度，设置为全透明
        jPanel.setPreferredSize(new Dimension(0, ScreenSize.scr_height*8/100));  //设置面板宽度为0，高度为屏幕高度8%

        //菜单面板添加元素
        jPanel.add(j1Sell);
        jPanel.add(j2Purchase);
        jPanel.add(j3Depot);
        jPanel.add(j4Finance);
        jPanel.add(j5Manage);
        jPanel.add(j6Life);



        //设置元素布局
        springLayout.putConstraint(SpringLayout.NORTH,j1Sell,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,j1Sell,ScreenSize.scr_width*5/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,j2Purchase,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,j2Purchase,ScreenSize.scr_width/100,SpringLayout.EAST,j1Sell);

        springLayout.putConstraint(SpringLayout.NORTH,j3Depot,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,j3Depot,ScreenSize.scr_width/100,SpringLayout.EAST,j2Purchase);

        springLayout.putConstraint(SpringLayout.NORTH,j4Finance,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,j4Finance,ScreenSize.scr_width/100,SpringLayout.EAST,j3Depot);

        springLayout.putConstraint(SpringLayout.NORTH,j5Manage,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,j5Manage,ScreenSize.scr_width*2/100,SpringLayout.EAST,j4Finance);

        springLayout.putConstraint(SpringLayout.NORTH,j6Life,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,j6Life,ScreenSize.scr_width*3/100,SpringLayout.EAST,j5Manage);


        j1Sell.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                jPanel.removeAll();
                jPanel.add(j1_title);
                jPanel.add(j1_Order);
                jPanel.add(j1_SalesSlip);
                jPanel.add(j1_SalesQuotation);
                jPanel.add(j1_SalesStatistics );
                jPanel.add(exittitle);
                springLayout.putConstraint(SpringLayout.NORTH,j1_title,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j1_title,ScreenSize.scr_width*2/100,SpringLayout.WEST,jPanel);

                springLayout.putConstraint(SpringLayout.NORTH,j1_Order,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j1_Order,ScreenSize.scr_width*2/100,SpringLayout.EAST,j1_title);

                springLayout.putConstraint(SpringLayout.NORTH,j1_SalesSlip,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j1_SalesSlip,ScreenSize.scr_width/100,SpringLayout.EAST,j1_Order);

                springLayout.putConstraint(SpringLayout.NORTH,j1_SalesQuotation,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j1_SalesQuotation,ScreenSize.scr_width*2/100,SpringLayout.EAST,j1_SalesSlip);

                springLayout.putConstraint(SpringLayout.NORTH,j1_SalesStatistics ,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j1_SalesStatistics ,ScreenSize.scr_width*2/100,SpringLayout.EAST,j1_SalesQuotation);

                springLayout.putConstraint(SpringLayout.NORTH,exittitle,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,exittitle,ScreenSize.scr_height*10/100,SpringLayout.EAST,j1_SalesStatistics );

                MainFrame.container.setVisible(false);
                MainFrame.container.setVisible(true);

            }
        });

        j1_Order.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                J2C4light.lightPanel.setVisible(true);
                MainFrame.light.setVisible(true);
                j1_Order.setForeground(new Color(255,255,255,255));
                J2C3Operation.jPanel.setVisible(true);
                MainFrame.jlpn1.setVisible(false);
                MainFrame.jlpn2.setVisible(true);

            }
        });
        exittitle.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                MainFrame.jlpn1.setVisible(true);
                MainFrame.jlpn2.setVisible(false);
                j1_Order.setForeground(new Color(255,255,255,120));
                jPanel.removeAll();
                jPanel.add(j1Sell);
                jPanel.add(j2Purchase);
                jPanel.add(j3Depot);
                jPanel.add(j4Finance);
                jPanel.add(j5Manage);
                jPanel.add(j6Life);

                //设置元素布局
                springLayout.putConstraint(SpringLayout.NORTH,j1Sell,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j1Sell,ScreenSize.scr_width*5/100,SpringLayout.WEST,jPanel);

                springLayout.putConstraint(SpringLayout.NORTH,j2Purchase,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j2Purchase,ScreenSize.scr_width/100,SpringLayout.EAST,j1Sell);

                springLayout.putConstraint(SpringLayout.NORTH,j3Depot,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j3Depot,ScreenSize.scr_width/100,SpringLayout.EAST,j2Purchase);

                springLayout.putConstraint(SpringLayout.NORTH,j4Finance,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j4Finance,ScreenSize.scr_width/100,SpringLayout.EAST,j3Depot);

                springLayout.putConstraint(SpringLayout.NORTH,j5Manage,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j5Manage,ScreenSize.scr_width*2/100,SpringLayout.EAST,j4Finance);

                springLayout.putConstraint(SpringLayout.NORTH,j6Life,ScreenSize.scr_height*2/100,SpringLayout.NORTH,jPanel);
                springLayout.putConstraint(SpringLayout.WEST,j6Life,ScreenSize.scr_width*3/100,SpringLayout.EAST,j5Manage);

                MainFrame.container.setVisible(false);
                MainFrame.container.setVisible(true);
            }
        });

        return jPanel;  //返回菜单实例对象
    }

}
