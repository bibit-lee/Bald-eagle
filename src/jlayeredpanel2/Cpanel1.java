package jlayeredpanel2;

import javax.swing.*;
import java.awt.*;

public class Cpanel1 {  //创建类
    static JButton jButton=new JButton();  //声明并实例化全局变量 按钮jButton
    public JLayeredPane Cpanel1(){   //实例方法
        JLayeredPane jLayeredPane=new JLayeredPane();  //实例化层级面板对象
        JPanel jPanel=new JPanel();  //实例化层面板中的面板1
        jPanel.setBackground(Color.green);   //为了方便调试，设置面板背景色
        jPanel.setBounds(0,0,300,300);  //层级面板没有布局管理器，所以设置坐标和尺寸

        JPanel jPanel1=new JPanel();  //实例化层面板中的面板2
        jPanel1.setBounds(200,200,300,300);
        jPanel1.setBackground(Color.red);

        SpringLayout springLayout=new SpringLayout();
        JPanel jPanel2=new JPanel(springLayout);
        jPanel2.setBounds(400,400,300,300);
        jPanel2.setBackground(Color.blue);
        springLayout.putConstraint(SpringLayout.EAST,jButton,0,SpringLayout.EAST,jPanel2);
        springLayout.putConstraint(SpringLayout.SOUTH,jButton,0,SpringLayout.SOUTH,jPanel2);


        jButton.setText("CLICK");  //设置按钮文本
        jButton.setSize(100,50);  //设置按钮尺寸
        jPanel2.add(jButton);  //面板2添加按钮

        jLayeredPane.add(jPanel,Integer.valueOf(100));  //层面板添加面板，设置为100层
        jLayeredPane.add(jPanel1,Integer.valueOf(200));
        jLayeredPane.add(jPanel2,Integer.valueOf(300));

        return jLayeredPane;   //返回层面板
    }
}
