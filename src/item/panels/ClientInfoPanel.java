package item.panels;


import item.Fonts;
import item.ScreenSize;
import javax.swing.*;
import java.awt.*;


public class ClientInfoPanel {
    public JPanel clientInfoPanel(){
        SpringLayout springLayout=new SpringLayout();
        JPanel jPanel=new JPanel(springLayout);


        JLabel companyTitle=new JLabel("11111");
        companyTitle.setPreferredSize(new Dimension(100,ScreenSize.scr_height*5/100));
        companyTitle.setFont(Fonts.getFontStandard());

        JLabel contactTitle=new JLabel("");
        contactTitle.setPreferredSize(new Dimension(100,ScreenSize.scr_height*5/100));
        contactTitle.setFont(Fonts.getFontStandard());

        JLabel addressTitle=new JLabel("");
        addressTitle.setPreferredSize(new Dimension(100,ScreenSize.scr_height*10/100));
        addressTitle.setFont(Fonts.getFontStandard());

        JLabel companyRes=new JLabel("");
        companyRes.setPreferredSize(new Dimension(0,ScreenSize.scr_height*5/100));
        companyRes.setFont(Fonts.getFontH2Bold());

        JLabel contactRes=new JLabel("");
        contactRes.setPreferredSize(new Dimension(0,ScreenSize.scr_height*5/100));
        contactRes.setFont(Fonts.getFontH2Bold());

        JLabel addressRes=new JLabel("");
        addressRes.setPreferredSize(new Dimension(0,ScreenSize.scr_height*10/100));
        addressRes.setFont(Fonts.getFontH2Bold());

        jPanel.add(companyTitle);
        jPanel.add(contactTitle);
        jPanel.add(addressTitle);
        jPanel.add(companyRes);
        jPanel.add(contactRes);
        jPanel.add(addressRes);


        springLayout.putConstraint(SpringLayout.NORTH,companyTitle,0,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,companyTitle,0,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,companyRes,0,SpringLayout.NORTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,companyRes,0,SpringLayout.EAST,companyTitle);
        springLayout.putConstraint(SpringLayout.EAST,companyRes,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,contactTitle,0,SpringLayout.SOUTH,companyTitle);
        springLayout.putConstraint(SpringLayout.WEST,contactTitle,0,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,contactRes,0,SpringLayout.SOUTH,companyRes);
        springLayout.putConstraint(SpringLayout.WEST,contactRes,0,SpringLayout.EAST,contactTitle);
        springLayout.putConstraint(SpringLayout.EAST,contactRes,0,SpringLayout.EAST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,addressTitle,0,SpringLayout.SOUTH,contactTitle);
        springLayout.putConstraint(SpringLayout.WEST,addressTitle,0,SpringLayout.WEST,jPanel);

        springLayout.putConstraint(SpringLayout.NORTH,addressRes,0,SpringLayout.SOUTH,contactRes);
        springLayout.putConstraint(SpringLayout.WEST,addressRes,0,SpringLayout.EAST,addressTitle);
        springLayout.putConstraint(SpringLayout.EAST,addressRes,0,SpringLayout.EAST,jPanel);



        return jPanel;
    }
}
