package jlayeredpanel.jlayered1;



import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C1Advert { //创建1类第一层对象，打开系统优先显示
    public static JButton jButton;

    //第一类第一层面板实例方法
    public JPanel c1Advert(){

        JPanel jPanel=new JPanel();  //实例化面板对象
        jButton=new JButton("关闭广告");//实例化按钮
        jButton.setSize(100,100);  //设置按钮尺寸
        jPanel.add(jButton);  //面板添加按钮

        //按钮添加鼠标点单击事件
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jPanel.setVisible(false);  //不论哪个键单击时，设置面板不可见
            }
        });


        return jPanel;
    }


}
