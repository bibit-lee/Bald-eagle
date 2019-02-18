package item;


import jlayeredpanel.jlayered2.J2C3Operation;
import jlayeredpanel.jlayered2.J2C4light;
import jlayeredpanel.jlayered2.J2C5ViewPanel;
import jlayeredpanel.jlayered2.Jlayered2;
import phixma.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class TabelModels {
    public static DefaultTableModel tableModel;
    public static TableColumn tcClientName;
    public static TableColumn tcContacts;
    public static TableColumn tcTelephone;
    public static TableColumn tcAddress;
    public static String sClientName;
    public static String sContacts;
    public static String sTelephone;
    public static String sAddress;




    public JTable getClient(){

        Conn b=new Conn();   //实例化连接类对象
        Connection con=b.getCon();  //获取数据库连接类实例方法

        tableModel=new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"","","",""});//设置表格头名称

        JTable jTable=new JTable(tableModel){
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        jTable.setRowHeight(ScreenSize.scr_height*5/100);
        jTable.setForeground(new Color(102,51,153));
        jTable.setFont(Fonts.getFontStandard());
        jTable.setSelectionBackground(new Color(245,245,245,200));
        jTable.setSelectionForeground(new Color(102,51,153));
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //设置表格行选择模式为单选模式
        jTable.setShowGrid(false);  //去除表格边框线
        jTable.setIntercellSpacing(new Dimension(0,0));//设置单元格之间的边距
        jTable.setEnabled(false);

        TableColumnModel tcm=jTable.getColumnModel();
        tcClientName=tcm.getColumn(0);
        tcContacts=tcm.getColumn(1);
        tcTelephone=tcm.getColumn(2);
        tcAddress=tcm.getColumn(3);

        jTable.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                int row=jTable.rowAtPoint(e.getPoint());  //获取鼠标所在的表格行
                //如果表格行为空则返回-1，则选中范围将报错，使用不能为-1
                if (row!=-1) {
                    jTable.setRowSelectionInterval(row, row);  //设置选中的索引行范围：从n行到n行

                }
            }
        });
        jTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row=jTable.rowAtPoint(e.getPoint());  //获取鼠标所在的表格行
                int i=e.getButton();
                Object ojClient=jTable.getValueAt(row,0);
                sClientName=ojClient.toString();
                Object ojContacts=jTable.getValueAt(row,1);
                sContacts=ojContacts.toString();
                Object ojTelephone=jTable.getValueAt(row,2);
                sTelephone=ojTelephone.toString();
                Object ojAddress=jTable.getValueAt(row,3);
                sAddress=ojAddress.toString();
                //如果表格行为空则返回-1，则选中范围将报错，使用不能为-1
                if (i==MouseEvent.BUTTON1) {
                    J2C3Operation.jPanel.setVisible(false);
                    J2C3Operation.topTransaction6.setVisible(false);
                    Jlayered2.c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100, ScreenSize.scr_width*40/100, ScreenSize.scr_height*24/100);
                    J2C4light.lightPanel.setVisible(false);
                    MainFrame.light.setVisible(false);
                    J2C5ViewPanel.jLabel.setVisible(true);


                }
            }
        });


        try{
            Statement sql=con.createStatement();
            ResultSet topTransaction6=sql.executeQuery("SELECT * FROM client ORDER BY TransactionLastMonth DESC LIMIT 6");
            while (topTransaction6.next()){
                String ClientName=topTransaction6.getString("ClientName");
                String Contacts=topTransaction6.getString("Contacts");
                String Telephone=topTransaction6.getString("Telephone");
                String Address=topTransaction6.getString("Address");
                tableModel.addRow(new Object[]{ClientName,Contacts,Telephone,Address});

        }
        }catch (Exception e){
            e.printStackTrace();
        }


        return jTable;
    }

}
