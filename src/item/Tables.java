package item;


import jlayeredpanel.jlayered2.*;
import phixma.MainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tables {
    public static JTable clientSearchTable;

    public JTable clientSearchTable(DefaultTableModel dtm){

        clientSearchTable=new JTable(dtm){
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        clientSearchTable.setRowHeight(ScreenSize.scr_height*5/100);
        clientSearchTable.setForeground(new Color(102,51,153));
        clientSearchTable.setFont(Fonts.getFontStandard());
        clientSearchTable.setSelectionBackground(new Color(245,245,245,200));
        clientSearchTable.setSelectionForeground(new Color(102,51,153));
        clientSearchTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //设置表格行选择模式为单选模式
        clientSearchTable.setShowGrid(false);  //去除表格边框线
        clientSearchTable.setIntercellSpacing(new Dimension(0,0));//设置单元格之间的边距
        clientSearchTable.setEnabled(false);

        TableColumnModel tcm=clientSearchTable.getColumnModel();
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

        clientSearchTable.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        clientSearchTable.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        clientSearchTable.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        clientSearchTable.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);



        clientSearchTable.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                int row=clientSearchTable.rowAtPoint(e.getPoint());  //获取鼠标所在的表格行
                System.out.println(row);
                //如果表格行为空则返回-1，则选中范围将报错，使用不能为-1
                if (row!=-1) {
                    clientSearchTable.setRowSelectionInterval(row, row);  //设置选中的索引行范围：从n行到n行
                }
            }
        });

        clientSearchTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row=clientSearchTable.rowAtPoint(e.getPoint());  //获取鼠标所在的表格行
                int i=e.getButton();
                if (row!=-1){

                    Object ojClient=clientSearchTable.getValueAt(row,0);
                    String sClientName=ojClient.toString();
                    Object ojContacts=clientSearchTable.getValueAt(row,1);
                    String sContacts=ojContacts.toString();
                    Object ojTelephone=clientSearchTable.getValueAt(row,2);
                    String sTelephone=ojTelephone.toString();
                    Object ojAddress=clientSearchTable.getValueAt(row,3);
                    String sAddress=ojAddress.toString();


                    //如果表格行为空则返回-1，则选中范围将报错，使用不能为-1
                    if (i==MouseEvent.BUTTON1) {
                        J2C3EmptyPanel.j2C3Panel.setVisible(false);
                        J2C3OperationClient.jPanel.setVisible(false);
                        J2C3OperationClient.emptyPanel.setVisible(false);
                        J2C5ViewPanel.jPanel.setVisible(true);
                        Jlayered2.c3Info.setBounds(ScreenSize.scr_width*30/100, ScreenSize.scr_height*10/100,ScreenSize.scr_width*40/100,ScreenSize.scr_height*24/100);
                        J2C4light.lightPanel.setVisible(false);
                        MainFrame.light.setVisible(false);
                        J2C5ViewPanel.clientNameLabel.setText(sClientName);
                        J2C5ViewPanel.clientContactLabel.setText(sContacts);
                        J2C5ViewPanel.clientTelephoneLabel.setText(sTelephone);
                        J2C5ViewPanel.clientAddressLabel.setText(sAddress);
                        J2C5ViewPanel.clientNameTitle.setText("客户名称：");
                        J2C5ViewPanel.contactsTitle.setText("联系方式：");
                        J2C5ViewPanel.addressTitle.setText("详细地址：");
                        J2C5ViewPanel.choiceLabel.setText(">");
                        J2C5ViewPanel.selectClient.setVisible(false);
                        J2C5ViewPanel.selectCommodity.setVisible(true);
                        TextFields.j2ClientSearchField.setText("");





                    }
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);


            }

        });


        return clientSearchTable;
    }


}
