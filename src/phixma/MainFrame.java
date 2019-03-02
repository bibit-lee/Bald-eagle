package phixma;


import item.ScreenSize;
import jlayeredpanel.jlayered1.Jlayered;
import jlayeredpanel.jlayered2.Jlayered2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MainFrame extends JFrame{   //创建主窗体
    public static JFrame jFrame;
    public static Container container;
    public static JLabel light;
    public static JLayeredPane jlpn1;
    public static JLayeredPane jlpn2;


    private MainFrame(){  //窗体构造方法

//窗体标题
        jFrame=new JFrame("Model S\n" +
                "Model X\n" +
                "Model 3\n" +
                "Roadster\n" +
                "Energy");
        jFrame.setExtendedState(MAXIMIZED_BOTH);    //设置窗体展开方式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container=jFrame.getContentPane();  //窗体添加内容面板作为容器
        SpringLayout springLayout=new SpringLayout();  //实例化弹簧布局管理器
        container.setLayout(springLayout);  //内容面板添加弹簧布局管理器

        TopLabel a=new TopLabel();   //实例化顶部标题类
        JLabel topLabel=a.topLabel();  //获取顶部标题类实例方法

        ImageIcon backIcon=new ImageIcon("res/homepage-models@2x.jpg");  //实例化背景图片
        JLabel backLabel=new JLabel(backIcon);  //实例化空标签，并添加图片
        ImageIcon backIcon1=new ImageIcon("res/homepage-models.jpg");
        JLabel backLabel1=new JLabel(backIcon1);
        ImageIcon imageIcon=new ImageIcon("res/homepage-models.jpg");
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(ScreenSize.scr_width,ScreenSize.scr_height,Image.SCALE_DEFAULT));

        Title t=new Title();   //实例化菜单类面板
        JPanel titlePanel=t.title();  //获取菜单类面板实例方法
        Jlayered jlayered =new Jlayered();  //实例化1类层面板
        jlpn1= jlayered.jLayeredPane1();   //获取1类层面板实例方法
        Jlayered2 jlayered2=new Jlayered2();
        jlpn2=jlayered2.jLayeredPane();
        jlpn2.setVisible(false);
        light=new JLabel();
        light.setBackground(new Color(34,34,34,200));
        light.setOpaque(true);
        light.setVisible(false);


        container.add(light);
        container.add(topLabel);  //内容面板添加元素
        container.add(titlePanel);
        container.add(jlpn1);
        container.add(jlpn2);



        if (ScreenSize.scr_width>=2160& ScreenSize.scr_width<=2880){
            container.add(backLabel);
            backLabel.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);
        }else if (ScreenSize.scr_width>=1440& ScreenSize.scr_width<2160){

            JLabel backLabel2=new JLabel(imageIcon);
            container.add(backLabel2);
            backLabel2.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);


        }else if (ScreenSize.scr_width<1440){
            container.add(backLabel1);
            backLabel1.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);
        }


        //弹簧布局管理器设置元素的布局


        springLayout.putConstraint(SpringLayout.NORTH,topLabel,0,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,topLabel,0,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,topLabel,0,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,titlePanel,0,SpringLayout.SOUTH,topLabel);
        springLayout.putConstraint(SpringLayout.WEST,titlePanel,0,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,titlePanel,0,SpringLayout.EAST,container);

        springLayout.putConstraint(SpringLayout.NORTH,light,0,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,light,0,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,light,0,SpringLayout.EAST,container);
        springLayout.putConstraint(SpringLayout.SOUTH,light,0,SpringLayout.SOUTH,titlePanel);

        springLayout.putConstraint(SpringLayout.NORTH,jlpn1,0,SpringLayout.SOUTH,titlePanel);
        springLayout.putConstraint(SpringLayout.WEST,jlpn1,0,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,jlpn1,0,SpringLayout.EAST,container);
        springLayout.putConstraint(SpringLayout.SOUTH,jlpn1,0,SpringLayout.SOUTH,container);

        springLayout.putConstraint(SpringLayout.NORTH,jlpn2,0,SpringLayout.SOUTH,titlePanel);
        springLayout.putConstraint(SpringLayout.WEST,jlpn2,0,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.EAST,jlpn2,0,SpringLayout.EAST,container);
        springLayout.putConstraint(SpringLayout.SOUTH,jlpn2,0,SpringLayout.SOUTH,container);




        //顶部标签标题添加鼠标点击监听器
        topLabel.addMouseListener(new MouseAdapter() {
            @Override
            //鼠标单击事件
            //当单击时，移除顶部标题标签，还欠弹开广告
            //刷新窗体，下方元素上移
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                container.remove(topLabel);
                container.setVisible(false);
                springLayout.putConstraint(SpringLayout.NORTH,titlePanel,0,SpringLayout.NORTH,container);
                container.setVisible(true);
            }
        });
        jFrame.setVisible(true);  //设置窗体可视

    }


    public static void main(String[] args) {
        new MainFrame();   //实例化窗体对象

    }
}
