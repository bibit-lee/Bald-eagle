package item;


import jlayeredpanel.jlayered2.Jlayered2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TextFields {
    public static JTextField j2ClientSearchField;
    public static String j2ClientSearchFieldText;
    public static JTextField mainProductSearchField;

    public JTextField J2clientSearchField(){
        j2ClientSearchField=new JTextField();
        j2ClientSearchField.setBorder(new EmptyBorder(0,ScreenSize.scr_width/100,0,ScreenSize.scr_width/100));
        j2ClientSearchField.setFont(Fonts.getFontH1Bold());

        j2ClientSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try{
                    Document document=e.getDocument();
                    j2ClientSearchFieldText=document.getText(0,document.getLength());
                    System.out.println(j2ClientSearchFieldText);
                }catch (BadLocationException e1){
                        e1.printStackTrace();
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                try{
                    j2ClientSearchFieldText=e.getDocument().getText(0,e.getDocument().getLength());
                    System.out.println(j2ClientSearchFieldText);
                }catch (BadLocationException e1){
                    e1.printStackTrace();
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        j2ClientSearchField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i=e.getButton();
                if (i==MouseEvent.BUTTON1){
                    Jlayered2.c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100, ScreenSize.scr_width*40/100, ScreenSize.scr_height*60/100);

                }
            }
        });



        return j2ClientSearchField;
    }

    public JTextField MainProductSearchField(){
        mainProductSearchField=new JTextField();
        mainProductSearchField.setBorder(new EmptyBorder(0,ScreenSize.scr_width/100,0,ScreenSize.scr_width/100));  //设置输入文本边距
        mainProductSearchField.setFont(Fonts.getFontH1Bold());
        return mainProductSearchField;
    }

}
