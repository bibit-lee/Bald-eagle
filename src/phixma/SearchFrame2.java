package phixma;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SearchFrame2 {   //创建搜索窗体类
    //获取屏幕尺寸
     static Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
     static int scr_width=(int)dimension.getWidth();
     static int scr_height=(int)dimension.getHeight();
     //声明对象
     JPanel ssk;
     JTable jTable;
     public SearchFrame2(){    //搜索窗体构造方法

         JFrame jFrame=new JFrame();  //实例化窗体对象
         JPanel jPanel=new JPanel();
         ResTable b1=new ResTable();
         jTable=b1.ResTable();


         jFrame.setLayout(null);  //设置窗体布局
         jFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
         Container c=jFrame.getContentPane();
         c.setBackground(Color.GREEN);
         SearchPanel j1=new SearchPanel();
         ssk=j1.getPanel();
         ssk.setLocation(scr_height*6/100,scr_height*6/100);
         jPanel.setBounds(1000,1000,500,500);
         jPanel.add(jTable);
         c.add(ssk);
         c.add(jPanel);

         jFrame.setVisible(true);
     }
    public static void main(String[] args) {
        new SearchFrame2();
    }

}
