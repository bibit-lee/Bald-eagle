package jlayeredpanel.jlayered1;


import item.ScreenSize;
import javax.swing.*;



public class Jlayered {  //创建层面板类



    //1级窗体层面板类实例方法（主窗体第1级显示）
    public JLayeredPane jLayeredPane1(){

        JLayeredPane jLayeredPane=new JLayeredPane(); //实例化层面板对象
        C1Advert c=new C1Advert();  //实例化第一层对象：广告面板
        JPanel c1Advert=c.c1Advert();  //获取第一层实例方法
        c1Advert.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);  //设置坐标和尺寸，宽和高为层面板最大尺寸

//注意：层面板没有布局管理器，必须设置坐标和尺寸，否则无法显示

        C2MainSearchPanel_2700 m=new C2MainSearchPanel_2700();  //实例化第二层对象：搜索框
        JPanel searchPanel=m.mainSearchPanel();  //获取第二层实例方法
        searchPanel.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);  //设置坐标和尺寸

        C3Light panels=new C3Light();  //实例化第三层对象：光过滤层
        JPanel light=panels.light();  //获取第三层实例方法
        light.setBounds(0,0,ScreenSize.scr_width,ScreenSize.scr_height);  //设置坐标和尺寸

        C5Recommend r=new C5Recommend();
        JPanel recommend=r.c5Recommend();
        recommend.setBounds(0,ScreenSize.scr_height*51/100,ScreenSize.scr_width,ScreenSize.scr_height*18/10);


        //层面板添加各层面板，数值越高为最优显示
        jLayeredPane.add(c1Advert,Integer.valueOf(700));
        jLayeredPane.add(searchPanel,Integer.valueOf(600));
        jLayeredPane.add(light,Integer.valueOf(500));
        jLayeredPane.add(recommend,Integer.valueOf(300));


        return jLayeredPane;  //返回1类层面板对象
    }
}
