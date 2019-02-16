package item;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;


public class Draw {

    public JPanel getUserSearchPanel(){
        class UserSearchBorder extends AbstractBorder {
            private final Color borderColor=new Color(189,189,189);
            private final BasicStroke stokeLine = new BasicStroke(   2.0f   );
            private int[]xs={ScreenSize.scr_width*2/100,ScreenSize.scr_width*7/100,ScreenSize.scr_width*8/100,ScreenSize.scr_width*38/100,ScreenSize.scr_width*38/100,ScreenSize.scr_width*2/100};
            private int[]ys={ScreenSize.scr_height*2/100,ScreenSize.scr_height*2/100,ScreenSize.scr_height*6/100,ScreenSize.scr_height*6/100,ScreenSize.scr_height*12/100,ScreenSize.scr_height*12/100};


            public void paintBorder(Component c,Graphics g,int x,int y,int width,int height){
                Graphics2D g2d=(Graphics2D)g;
                g2d.setColor(new Color(255,255,255,255));
                g2d.setStroke(stokeLine);
                g2d.setColor(borderColor);
                g2d.drawPolygon(xs,ys,6);

            }
        }

        JPanel userSearchPanel=new JPanel();
        userSearchPanel.setBackground(Color.WHITE);
        userSearchPanel.setBorder(new UserSearchBorder());
        userSearchPanel.setLayout(null);

        TextFields t1=new TextFields();
        JTextField textField=t1.J2clientSearchField();
        textField.setBounds(ScreenSize.scr_width*2/100+3,ScreenSize.scr_height*6/100+3,ScreenSize.scr_width*36/100-6,ScreenSize.scr_height*6/100-6);


        JLabel keyLabel=Labels.getKeybordSearchTitle();
        keyLabel.setBounds(ScreenSize.scr_width*2/100+3,ScreenSize.scr_height*2/100+3,ScreenSize.scr_width*5/100,ScreenSize.scr_height*4/100);
        keyLabel.setFont(Fonts.getFontStandard());

        userSearchPanel.add(keyLabel);
        userSearchPanel.add(textField);


        return userSearchPanel;
    }


}
