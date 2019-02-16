package item;

import java.awt.*;

public class ScreenSize {  //创建公共类
    //声明屏幕尺寸获取方式和尺寸为全局变量
    static Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
    public static int scr_width=(int)dimension.getWidth();
    public static int scr_height=(int)dimension.getHeight();

}
