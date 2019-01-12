package phixma2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lb200 on 2019-01-11.
 */
public class SearchFrame extends JFrame{
    public SearchFrame(){
        Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
        int scr_width=(int)dimension.getWidth();
        int scr_height=(int)dimension.getHeight();
        JFrame jFrame=new JFrame();
        jFrame.setExtendedState(MAXIMIZED_BOTH);
        SpringLayout springLayout=new SpringLayout();
        jFrame.setLayout(springLayout);
    }
}
