package phixma;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SearchPanel extends JPanel{  //创建搜索框类，并继承面板类
    static JTextField jTextField=new JTextField();
    public JPanel getPanel(){  //搜索框类构建方法
        JPanel jPanel=new JPanel();  //实例化面板对象
        jPanel.setBackground(Color.WHITE);  //设置面板背景色为白色
        ImageIcon icon=new ImageIcon("res/search.png");   //实例化图片对象
        int icon_width=icon.getIconWidth();  //获取图片宽度
        int icon_height=icon.getIconHeight();  //获取图片高度
        JButton jButton=new JButton(icon);  //实例化按钮对象
        SpringLayout springLayout=new SpringLayout();  //实例化弹簧布局对象
        jPanel.setLayout(springLayout);  //设置面板布局为弹簧布局
        /*
        设置面板尺寸,scr_width和scr_height 为全局变量
        面板宽为屏幕宽度的41%+搜索图标宽，面板高为屏幕高度的6%
        按钮的尺寸为图标的尺寸
        去除按钮边框
        */
        jPanel.setSize(SearchFrame.scr_width*41/100+icon_width, SearchFrame.scr_height*6/100);
        jButton.setPreferredSize(new Dimension(icon_width,icon_height));
        jButton.setBorder(new EmptyBorder(0,0,0,0));
        jButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        /*
        文本框尺寸为屏幕宽度40% x 4%
        设置文本框为无边框，输入内容距两端50像素
        设置文本框字体样式
         */
        jTextField.setPreferredSize(new Dimension(SearchFrame.scr_width*40/100, SearchFrame.scr_height*4/100));
        jTextField.setBorder(new EmptyBorder(0,50,0,50));
        jTextField.setFont(new Font("微软雅黑",Font.BOLD,32));

        jPanel.add(jTextField);  //面板添加文本框
        jPanel.add(jButton);   //面板添加按钮

        //设置组件布局
        springLayout.putConstraint(SpringLayout.NORTH,jTextField, SearchFrame.scr_height/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jTextField,0,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,jButton,(SearchFrame.scr_height*6/100-icon_height)/2,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jButton,0,SpringLayout.EAST,jTextField);
        springLayout.putConstraint(SpringLayout.EAST,jButton,-(SearchFrame.scr_width/100),SpringLayout.EAST,jPanel);




        return jPanel;  //返回面板对象
    }
}
