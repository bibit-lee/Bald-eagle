package phixma3;

import javax.swing.*;
import java.awt.*;

public class GetConstantDemo { //创建窗体类
    public JFrame getConstantDemo(){   //类的实例方法
        JFrame jFrame=new JFrame();  //实例化窗体对象
        jFrame.setExtendedState(Frame.MAXIMIZED_BOTH);   //设置窗体尺寸
        Container container=jFrame.getContentPane();   //窗体获取内容面板容器
        SpringLayout springLayout=new SpringLayout();   //实例化弹簧布局对象
        container.setLayout(springLayout);  //设置容器布局为弹簧布局
        Spring widthSP=Spring.constant(60,300,600);   //创建一个弹簧
        Spring heightST=Spring.constant(60);  //创建一个支柱
        JButton lButton=new JButton("按钮L");  //实例化按钮L 对象
        SpringLayout.Constraints lButtonCons=springLayout.getConstraints(lButton);  //获取 按钮L 的约束条件对象
        lButtonCons.setWidth(widthSP);  //设置控制组件宽度的弹簧
        lButtonCons.setHeight(heightST);  //设置控制组件高度的支柱

        JButton rButton=new JButton("按钮R");  //实例化按钮R 对象
        SpringLayout.Constraints rButtonCons=springLayout.getConstraints(rButton); //获取 按钮R 的约束条件对象
        rButtonCons.setWidth(widthSP); //设置控制组件宽度的弹簧
        rButtonCons.setHeight(heightST);  //设置控制组件高度的支柱

        springLayout.putConstraint(SpringLayout.NORTH,lButton,heightST,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,lButton,widthSP,SpringLayout.WEST,container);

        springLayout.putConstraint(SpringLayout.NORTH,rButton,0,SpringLayout.NORTH,lButton);
        springLayout.putConstraint(SpringLayout.WEST,rButton,Spring.scale(widthSP,2),SpringLayout.EAST,lButton);
        springLayout.putConstraint(SpringLayout.EAST,container,widthSP,SpringLayout.EAST,rButton);

        container.add(lButton);
        container.add(rButton);
        jFrame.setVisible(true);

        return jFrame;
    }

    public static void main(String[] args) {
        new GetConstantDemo().getConstantDemo();
    }
}
