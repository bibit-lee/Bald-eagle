package jlayeredpanel.jlayered1;


import item.Fonts;
import item.Labels;
import item.ScreenSize;
import item.TextFields;
import phixma.MainFrame;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class C2MainSearchPanel_2700 {  //创建第一类第2层面板
    public static JPanel jPanel;

    public JPanel mainSearchPanel(){  //第一类第2层面板实例方法

        class MainSearchBorder extends AbstractBorder{  //创建内部边框类继承边框抽象类
            private final Color borderColor = new Color(255, 69, 0);  //设置边框颜色
            private int[]xs={ScreenSize.scr_width*18/100, ScreenSize.scr_width*23/100, ScreenSize.scr_width*24/100, ScreenSize.scr_width*58/100, ScreenSize.scr_width*58/100, ScreenSize.scr_width*18/100};   //声明多边形填充绘图 x 轴坐标数组
            private int[]ys={ScreenSize.scr_height*8/100, ScreenSize.scr_height*8/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*18/100, ScreenSize.scr_height*18/100};   //声明多边形填充绘图 y 轴坐标数组
            private int[]xu={ScreenSize.scr_width*235/1000, ScreenSize.scr_width*285/1000, ScreenSize.scr_width*295/1000, ScreenSize.scr_width*235/1000};   //声明多边形空心绘图 x 轴坐标数组
            private int[]yu={ScreenSize.scr_height*8/100, ScreenSize.scr_height*8/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*12/100};  //声明多边形空心绘图 y 轴坐标数组

            //图形绘制方法
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
                Graphics2D g2d=(Graphics2D)g;
                g2d.setColor(new Color(255,255,255,255));  //设置图形填充颜色
                g2d.fillPolygon(xs,ys,6);  //设置图形坐标和顶点
                g2d.drawPolygon(xu,yu,4);
                g2d.setColor(borderColor);  //设置图形边框颜色
            }
        }


        class MainSearchBorder2 extends AbstractBorder{
            private final Color borderColor = new Color(255, 69, 0);  //设置边框颜色
            private int[]xs={ScreenSize.scr_width*18/100, ScreenSize.scr_width*235/1000, ScreenSize.scr_width*235/1000, ScreenSize.scr_width*285/1000, ScreenSize.scr_width*295/1000, ScreenSize.scr_width*58/100, ScreenSize.scr_width*58/100, ScreenSize.scr_width*18/100};   //声明多边形填充绘图 x 轴坐标数组
            private int[]ys={ScreenSize.scr_height*12/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*8/100, ScreenSize.scr_height*8/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*18/100, ScreenSize.scr_height*18/100};   //声明多边形填充绘图 y 轴坐标数组
            private int[]xu={ScreenSize.scr_width*18/100, ScreenSize.scr_width*23/100, ScreenSize.scr_width*24/100, ScreenSize.scr_width*18/100};   //声明多边形空心绘图 x 轴坐标数组
            private int[]yu={ScreenSize.scr_height*8/100, ScreenSize.scr_height*8/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*12/100};  //声明多边形空心绘图 y 轴坐标数组

            public void paintBorder(Component c,Graphics g,int x,int y,int width,int heitht){
                Graphics2D g2d=(Graphics2D)g;
                g2d.setColor(new Color(255,255,255,255));
                g2d.fillPolygon(xs,ys,8);
                g2d.drawPolygon(xu,yu,4);
                g2d.setColor(borderColor);
            }
        }



        jPanel=new JPanel();  //实例化面板对象
        jPanel.setLayout(null);  //图形坐标改变麻烦，取消布局管理器采用自由布局
        jPanel.setOpaque(false);  //设置面板透明
        jPanel.setBorder(new MainSearchBorder());  //绘制图形



        ImageIcon icon=new ImageIcon(new ImageIcon("res/search1.jpg").getImage().getScaledInstance(ScreenSize.scr_height*4/100, ScreenSize.scr_height*4/100,Image.SCALE_DEFAULT));  //实例化并设置图标
        JLabel iconLabel=new JLabel(icon);
        iconLabel.setBounds(ScreenSize.scr_width*54/100, ScreenSize.scr_height*12/100, ScreenSize.scr_height*6/100, ScreenSize.scr_height*6/100);

        TextFields t1=new TextFields();
        JTextField jTextField=t1.MainProductSearchField();  //实例化文本输入框对象
        jTextField.setBounds(ScreenSize.scr_width*18/100, ScreenSize.scr_height*12/100, ScreenSize.scr_width*36/100, ScreenSize.scr_height*6/100);  //设置文本输入框尺寸，尽量以120的倍数建立


        JLabel selectLabel=Labels.getSelectSearchTitle();
        selectLabel.setBounds(ScreenSize.scr_width*237/1000, ScreenSize.scr_height*8/100, ScreenSize.scr_width*5/100, ScreenSize.scr_height*4/100);
        selectLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        selectLabel.setFont(Fonts.getFontStandard());

        JLabel titleLabel=Labels.getKeybordSearchTitle();
        titleLabel.setFont(Fonts.getFontStandard());
        titleLabel.setBounds(ScreenSize.scr_width*18/100, ScreenSize.scr_height*8/100, ScreenSize.scr_width*55/1000, ScreenSize.scr_height*4/100);


        if (ScreenSize.scr_width>=2160){
            ImageIcon logo=new ImageIcon("res/Bing6.png");   //实例化并设置LOGO
            JLabel logoLabel=new JLabel(logo);
            logoLabel.setBounds(ScreenSize.scr_width*6/100, ScreenSize.scr_height*12/100, ScreenSize.scr_width*9/100, ScreenSize.scr_height*5/100);

            jPanel.add(logoLabel);  //面板添加元素

        }else if(ScreenSize.scr_width<2160& ScreenSize.scr_width>=1600){


        }else if(ScreenSize.scr_width<1600){


        }

        jPanel.add(iconLabel);
        jPanel.add(selectLabel);
        jPanel.add(titleLabel);
        jPanel.add(jTextField);

        //添加文本框鼠标监听器
        jTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i = e.getButton();  //获取鼠标按键数据

                if (i == MouseEvent.BUTTON1) {  //如果左键单击
                    MainFrame.light.setVisible(true);
                    C3Light.lightPanel.setVisible(true);  //光过滤层显示，聚焦文本输入框
                }
            }
        });
        //设置面板鼠标监听器，点击面板则取消光过滤层显示
        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                MainFrame.light.setVisible(false);
                C3Light.lightPanel.setVisible(false);
            }
        });



        selectLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                jPanel.setBorder(new MainSearchBorder2());
                selectLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                titleLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
        titleLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                jPanel.setBorder(new MainSearchBorder());
                selectLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
                titleLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        return jPanel;  //返回面板实例对象
    }
}
