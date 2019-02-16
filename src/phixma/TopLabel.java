package phixma;

import item.Fonts;
import item.ScreenSize;
import item.Res;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;


public class TopLabel{  //创建顶部标题类
//顶部标题类面板实例方法
    public JLabel topLabel(){

        String topLabelText=null;  //实例化字符串型标题
        Res a=new Res();  //实例化数据集类对象
        ResultSet res=a.getToplabelRes();  //获取标题类数据获取方法
        //捕捉获取过程的异常
       try{
           //指针指向数据
           while (res.next()){
               String title=res.getString("title");  //实例化字符串title
               String click=res.getString("click");  //实例化点击字符串click
               topLabelText=title+click;  //顶部标题内容为：两个字段组合显示
           }
       }catch (Exception e){
           e.printStackTrace();
       }
        JLabel jLabel=new JLabel(topLabelText,SwingConstants.CENTER);  //实例化标签，内容从数据集获取，文本居中

        jLabel.setForeground(Color.WHITE);  //设置文字颜色
        jLabel.setBackground(new Color(54,54,54,150));   //设置背景颜色和透明度，0最小（全透明），255最大（不透明）
        jLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));  //设置鼠标在标签上的样式
        jLabel.setOpaque(true);  //标签默认为透明的，设置标签不透明
        jLabel.setPreferredSize(new Dimension(0, ScreenSize.scr_height*4/100));  //设置标签宽度为0，高度为屏幕高度4%
        jLabel.setFont(Fonts.getFontStandard());

        return jLabel;  //返回标签实例对象
    }

    public static void main(String[] args) {
        new TopLabel().topLabel();
    }

}
