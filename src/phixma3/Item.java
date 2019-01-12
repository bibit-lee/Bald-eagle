package phixma3;

import java.awt.*;

public class Item {
    Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
    int scr_width=(int)dimension.getWidth();
    int scr_height=(int)dimension.getHeight();

    static int searchPanel_widht;


    public int getwidth(){

        searchPanel_widht=scr_width*70/100;
        return searchPanel_widht;
    }




}
