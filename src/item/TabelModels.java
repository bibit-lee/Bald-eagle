package item;


import jlayeredpanel.jlayered2.J2C3Operation;
import jlayeredpanel.jlayered2.J2C4light;
import jlayeredpanel.jlayered2.Jlayered2;
import phixma.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;


public class TabelModels {
    public static DefaultTableModel tableModel;
    public static String sClientName;
    public static String sContacts;
    public static String sTelephone;
    public static String sAddress;


    public JTable getClient(){
        tableModel=new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"col0","col1","col2","col3"});//设置类名
        Res res=new Res();
        ResultSet topTransaction6=res.gettopTransaction6();
        try{
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
        TableColumn tcTelephone=tcm.getColumn(2);
        TableColumn tcAddress=tcm.getColumn(3);

        tcTelephone.setWidth(0);
        tcTelephone.setMaxWidth(0);
        tcTelephone.setMinWidth(0);
        tcTelephone.setPreferredWidth(0);

        tcAddress.setWidth(0);
        tcAddress.setMaxWidth(0);
        tcAddress.setMinWidth(0);
        tcAddress.setPreferredWidth(0);

        jTable.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        jTable.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        jTable.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        jTable.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);





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

                }
            }
        });

        return jTable;
    }

    public static void main(String[] args) {
        new TabelModels().getClient();
    }

}
