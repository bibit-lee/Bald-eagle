package phixma3;

import javax.swing.*;
import java.awt.*;

public class ConstantDemo extends JFrame {  //创建类继承窗体类
    public ConstantDemo(){  //类的构造方法
        JFrame jFrame=new JFrame();   //实例化窗体对象
        jFrame.setExtendedState(MAXIMIZED_BOTH);  //设置窗体尺寸
        Container container=jFrame.getContentPane();  //获取内容面板容器
        SpringLayout springLayout=new SpringLayout();  //实例化布局对象
        container.setLayout(springLayout);  //设置面板容器布局为弹簧布局
        Spring vST=Spring.constant(20);  //创建支柱，尺寸为20像素
        Spring hSP=Spring.constant(10,100,150);  //创建弹簧，最小之为20，默认值为100，最大值为500
        JButton lButton=new JButton("按钮L");  //实例化按钮L对象

        container.add(lButton);  //容器添加按钮L

        /*设置按钮L组件布局*/
        springLayout.putConstraint(SpringLayout.NORTH,lButton,vST,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,lButton,10,SpringLayout.WEST,container);

        JButton rButton=new JButton("按钮R");  //实例化按钮R对象

        container.add(rButton);  //容器添加按钮R
        /*
        设置按钮R布局
        其中第一行：按钮R的北边--->距离按钮L的北边   0像素
        第二行：按钮R的西边--->距离按钮L的东边    2倍弹簧
         */
        springLayout.putConstraint(SpringLayout.NORTH,rButton,0,SpringLayout.NORTH,lButton);
        springLayout.putConstraint(SpringLayout.WEST,rButton,Spring.scale(hSP,2),SpringLayout.EAST,lButton);
        springLayout.putConstraint(SpringLayout.EAST,container,10,SpringLayout.EAST,rButton);


        jFrame.setVisible(true);  //设置窗体可见
    }

    public static void main(String[] args) {   //主方法
        new ConstantDemo();   //实例化类对象
    }
}
