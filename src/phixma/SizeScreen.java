package phixma;

import java.awt.*;

public class SizeScreen {
    static int MainSearch_Panel_width;
    Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
    int scr_width=(int)dimension.getWidth();
    int scr_height=(int)dimension.getHeight();

    public int getWidthMS_Panel(){
        MainSearch_Panel_width=scr_width*46/100;
        return MainSearch_Panel_width;
    }
}
