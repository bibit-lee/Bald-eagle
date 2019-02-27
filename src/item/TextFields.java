package item;


import jlayeredpanel.jlayered2.J2C3Operation;
import jlayeredpanel.jlayered2.Jlayered2;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TextFields {   //创建搜索框类

    public static JTextField j2ClientSearchField;   //声明搜索框为客户搜索框
    public static JTable clientSearchTable;
    public static JTextField mainProductSearchField;

    public JTextField J2clientSearchField(){   //客户搜索框构造方法

        j2ClientSearchField=new JTextField();
        j2ClientSearchField.setBorder(new EmptyBorder(0,ScreenSize.scr_width/100,0,ScreenSize.scr_width/100)); //文本框内容边距
        j2ClientSearchField.setFont(Fonts.getFontH1Bold());   //文本框从字体类获取字体

        Document dt=j2ClientSearchField.getDocument();
        //文本输入监听
        dt.addDocumentListener(new javax.swing.event.DocumentListener() {
            Conn a=new Conn();
            Connection con=a.getCon();
            @Override
            //文本插入监听事件
            public void insertUpdate(DocumentEvent e) {

                try{
                    Document document=e.getDocument();
                    String search=document.getText(0,document.getLength());
                    J2C3Operation.topTransaction6.setVisible(false);

                    Statement sql=con.createStatement();
                    ResultSet clientSearch=sql.executeQuery("SELECT * FROM client WHERE Initials LIKE '%"+search+"%'LIMIT 8");
                    DefaultTableModel tableModel=new DefaultTableModel();
                    tableModel.setColumnIdentifiers(new Object[]{"col0","col1","col2","col3"});//设置类名


                        while (clientSearch.next()){
                            String ClientName=clientSearch.getString("ClientName");
                            String Contacts=clientSearch.getString("Contacts");
                            String Telephone=clientSearch.getString("Telephone");
                            String Address=clientSearch.getString("Address");
                            tableModel.addRow(new Object[]{ClientName,Contacts,Telephone,Address});

                            Tables t=new Tables();
                            clientSearchTable=t.clientSearchTable(tableModel);
                            clientSearchTable.setBounds(0,0,ScreenSize.scr_width*40/100,ScreenSize.scr_height);
                            J2C3Operation.emptyPanel.add(clientSearchTable);
                            clientSearchTable.updateUI();
                        }

                }catch (Exception e1){
                    e1.printStackTrace();


                }

            }
            @Override
            //文本删除监听事件
            public void removeUpdate(DocumentEvent e) {
                try{
                    Document document=e.getDocument();
                    String search=document.getText(0,document.getLength());
                    J2C3Operation.topTransaction6.setVisible(false);

                    Statement sql=con.createStatement();
                    ResultSet clientSearch=sql.executeQuery("SELECT * FROM client WHERE Initials LIKE '%"+search+"%'LIMIT 8");
                    DefaultTableModel tableModel=new DefaultTableModel();
                    tableModel.setColumnIdentifiers(new Object[]{"col0","col1","col2","col3"});//设置类名

                    while (clientSearch.next()){
                        String ClientName=clientSearch.getString("ClientName");
                        String Contacts=clientSearch.getString("Contacts");
                        String Telephone=clientSearch.getString("Telephone");
                        String Address=clientSearch.getString("Address");
                        tableModel.addRow(new Object[]{ClientName,Contacts,Telephone,Address});
                        System.out.println(ClientName);
                        Tables t=new Tables();
                        clientSearchTable=t.clientSearchTable(tableModel);
                        clientSearchTable.setBounds(0,0,ScreenSize.scr_width*40/100,ScreenSize.scr_height);
                        J2C3Operation.emptyPanel.add(clientSearchTable);
                        clientSearchTable.updateUI();
                    }

                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
            @Override
            //文本修改监听事件
            public void changedUpdate(DocumentEvent e) {
                try{
                    Document document=e.getDocument();
                    String search=document.getText(0,document.getLength());
                    J2C3Operation.topTransaction6.setVisible(false);

                    Statement sql=con.createStatement();
                    ResultSet clientSearch=sql.executeQuery("SELECT * FROM client WHERE Initials LIKE '%"+search+"%'LIMIT 8");
                    DefaultTableModel tableModel=new DefaultTableModel();
                    tableModel.setColumnIdentifiers(new Object[]{"col0","col1","col2","col3"});//设置类名

                    while (clientSearch.next()){
                        String ClientName=clientSearch.getString("ClientName");
                        String Contacts=clientSearch.getString("Contacts");
                        String Telephone=clientSearch.getString("Telephone");
                        String Address=clientSearch.getString("Address");
                        tableModel.addRow(new Object[]{ClientName,Contacts,Telephone,Address});
                        System.out.println(ClientName);
                        Tables t=new Tables();
                        clientSearchTable=t.clientSearchTable(tableModel);
                        clientSearchTable.setBounds(0,0,ScreenSize.scr_width*40/100,ScreenSize.scr_height);
                        J2C3Operation.emptyPanel.add(clientSearchTable);
                        clientSearchTable.updateUI();
                    }

                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }

        });


        j2ClientSearchField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int i=e.getButton();
                if (i==MouseEvent.BUTTON1){
                    Jlayered2.c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100, ScreenSize.scr_width*40/100, ScreenSize.scr_height*60/100);
                    J2C3Operation.topTransaction6.setVisible(true);
                    J2C3Operation.topTransaction6.updateUI();

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
