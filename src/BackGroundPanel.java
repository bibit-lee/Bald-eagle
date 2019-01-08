import javax.swing.*;
import java.awt.*;

public class BackGroundPanel {
    public JPanel backGroundPanel(){

        Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
        int scr_width=(int)dimension.getWidth();
        int scr_height=(int) dimension.getHeight();
        JPanel beijing=new JPanel();
        beijing.setOpaque(false);
        beijing.setLayout(null);
        beijing.setSize(scr_width,scr_height);
        ImageIcon bjPic=new ImageIcon("C:\\Users\\dell\\IdeaProjects\\Bald-eagle\\res\\pic.jpg");
        bjPic.setImage(bjPic.getImage().getScaledInstance(scr_width,scr_height,Image.SCALE_FAST));
        JLabel bgLabel=new JLabel(bjPic);
        bgLabel.setBounds(0,0,scr_width,scr_height);
        beijing.add(bgLabel);
        beijing.setVisible(true);
        return beijing;
    }
}
