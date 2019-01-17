package jlayeredpanel2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {  //创建Frame类继承窗体类

    public Frame(){  //类的构造方法
        JLayeredPane jlp1;  //声明 JLayeredPane 对象jlp1
        JLayeredPane jlp2;  //声明 JLayeredPane 对象jlp2
        JFrame jFrame=new JFrame("切换层面板演示");   //实例化窗体
        jFrame.setExtendedState(MAXIMIZED_BOTH);    //设置窗体为最大尺寸
        Container container=jFrame.getContentPane();  //窗体获取内容面板
        container.setBackground(Color.pink);  //为了好调试，设置内容面板背景色，证明其他面板是添加在内容面板上
        Cpanel1 a=new Cpanel1();  //实例化 Cpanel1 类
        jlp1=a.Cpanel1();   //jlp1调用实例方法
        container.add(jlp1);  //容器添加层面板
        Cpanel2 b=new Cpanel2();   //实例化 Cpanel2 类
        jlp2=b.Cpanel2();   //jlp2调用实例方法


        Cpanel1.jButton.addMouseListener(new MouseAdapter() {  //鼠标监听第一层的按钮
            @Override
            public void mouseClicked(MouseEvent e) {  //鼠标点击事件
                super.mouseClicked(e);
                container.remove(jlp1);   // 容器移除第一个层级面板
                container.setVisible(false);   //设置容器不可见，作用为更新。validate()、pack()、repaint()都不行
                container.add(jlp2);   //容器添加第二个层级面板
                container.setVisible(true);  //设置容器再次可见，作用为更新
            }
        });

        jFrame.setVisible(true);  //设置窗体可见
    }

    public static void main(String[] args) {
        new Frame();
    }

}
