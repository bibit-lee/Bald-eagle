package jlayeredpanel.jlayered1;

import item.Fonts;
import item.Labels;
import item.ScreenSize;
import phixma.MainFrame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

public class C5Recommend {
    int b;


    public JPanel c5Recommend(){

        SpringLayout springLayout=new SpringLayout();
        JPanel jPanel=new JPanel(springLayout);
        jPanel.setOpaque(false);

        JLabel Upward= Labels.getRecommendSymbolIcon();
        Upward.setFont(Fonts.getSymbolH0());
        Upward.setText("∧");

        JLabel Down=Labels.getRecommendSymbolIcon();
        Down.setFont(Fonts.getSymbolH0());
        Down.setText("∨");

        JLabel Left=Labels.getRecommendSymbolIcon();
        Left.setFont(Fonts.getSymbolH0());
        Left.setText("<");

        JLabel Right=Labels.getRecommendSymbolIcon();
        Right.setFont(Fonts.getSymbolH0());
        Right.setText(">");

        JLabel Set=Labels.getRecommendSymbolIcon();
        Set.setFont(Fonts.getSymbolH0());
        Set.setText("≡");

        JLabel discovery=new JLabel("探索发现",SwingConstants.CENTER);
        discovery.setPreferredSize(new Dimension(ScreenSize.scr_width*10/100,ScreenSize.scr_width*3/100));
        discovery.setBackground(new Color(54,54,54,150));
        discovery.setOpaque(true);
        discovery.setForeground(Color.WHITE);
        JLabel tips=new JLabel("FJDKFJKDJFKDJFKDJFKDFDFK33333333333333333333333333333333333333333333");
        tips.setPreferredSize(new Dimension(ScreenSize.scr_width*22/10,ScreenSize.scr_height*2/10));
        tips.setBackground(new Color(28,28,28,200));
        tips.setOpaque(true);
        tips.setForeground(Color.WHITE);
        if (ScreenSize.scr_width>=2160){
            discovery.setFont(new Font("Microsoft YaHei UI",Font.PLAIN,28));
            tips.setFont(new Font("Microsoft YaHei UI",Font.PLAIN,28));
        }else if(ScreenSize.scr_width<2160&ScreenSize.scr_width>=1600){
            discovery.setFont(new Font("Microsoft YaHei UI",Font.PLAIN,20));
            tips.setFont(new Font("Microsoft YaHei UI",Font.PLAIN,20));
        }else if(ScreenSize.scr_width<1600){
            discovery.setFont(new Font("Microsoft YaHei UI",Font.PLAIN,16));
            tips.setFont(new Font("Microsoft YaHei UI",Font.PLAIN,16));

        }



        JPanel content=new JPanel();
        content.setPreferredSize(new Dimension(ScreenSize.scr_width,ScreenSize.scr_height*63/100));
        content.setForeground(Color.WHITE);



        jPanel.add(Upward);
        jPanel.add(Down);
        jPanel.add(Left);
        jPanel.add(Right);
        jPanel.add(Set);
        jPanel.add(discovery);
        jPanel.add(tips);
        jPanel.add(content);


        springLayout.putConstraint(SpringLayout.NORTH,tips,ScreenSize.scr_height*3/100,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,tips,ScreenSize.scr_width*73/100,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,tips,-ScreenSize.scr_width*5/100,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,Upward,ScreenSize.scr_height/100,SpringLayout.SOUTH,tips);
        springLayout.putConstraint(SpringLayout.WEST,Upward,ScreenSize.scr_width*5/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,Down,ScreenSize.scr_height/100,SpringLayout.SOUTH,tips);
        springLayout.putConstraint(SpringLayout.WEST,Down,ScreenSize.scr_width*5/100,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,discovery,ScreenSize.scr_height/100,SpringLayout.SOUTH,tips);
        springLayout.putConstraint(SpringLayout.WEST,discovery,ScreenSize.scr_width*76/100-6,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,Left,ScreenSize.scr_height/100,SpringLayout.SOUTH,tips);
        springLayout.putConstraint(SpringLayout.WEST,Left,2,SpringLayout.EAST,discovery);

        springLayout.putConstraint(SpringLayout.NORTH,Right,ScreenSize.scr_height/100,SpringLayout.SOUTH,tips);
        springLayout.putConstraint(SpringLayout.WEST,Right,2,SpringLayout.EAST,Left);

        springLayout.putConstraint(SpringLayout.NORTH,Set,ScreenSize.scr_height/100,SpringLayout.SOUTH,tips);
        springLayout.putConstraint(SpringLayout.WEST,Set,2,SpringLayout.EAST,Right);
        springLayout.putConstraint(SpringLayout.EAST,Set,-ScreenSize.scr_width*5/100,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,content,ScreenSize.scr_height*2/100,SpringLayout.SOUTH,Set);
        springLayout.putConstraint(SpringLayout.WEST,content,0,SpringLayout.WEST,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,content,0,SpringLayout.EAST,jPanel);
        springLayout.putConstraint(SpringLayout.SOUTH,content,0,SpringLayout.SOUTH,jPanel);

        b=ScreenSize.scr_height*51/100;

        MainFrame.jFrame.addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
                if (e.getWheelRotation()==1){
                    b-=100;
                    jPanel.setLocation(0,b);
                    jPanel.validate();
                }
                if (e.getWheelRotation()==-1){
                    b+=100;
                    jPanel.setLocation(0,b);
                    jPanel.validate();
                }
            }
        });


        return jPanel;
    }
}
