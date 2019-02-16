package item;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class TabelModels {
    static String ClientName;
    static String Contacts;

    public JTable getClient(){

        Conn b=new Conn();   //实例化连接类对象
        Connection con=b.getCon();  //获取数据库连接类实例方法
        DefaultTableModel tableModel=new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"",""});//设置表格头名称
        JTable jTable=new JTable(tableModel){
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        jTable.setRowHeight(50);
        jTable.setFont(Fonts.getFontStandard());
        jTable.setShowGrid(false);

        


        try{
            Statement sql=con.createStatement();
            ResultSet topTransaction6=sql.executeQuery("SELECT * FROM client ORDER BY TransactionLastMonth DESC LIMIT 6");

            while (topTransaction6.next()){
                ClientName=topTransaction6.getString("ClientName");
                Contacts=topTransaction6.getString("Contacts");
                tableModel.addRow(new Object[]{ClientName,Contacts});
        }

        }catch (Exception e){
            e.printStackTrace();
        }




        return jTable;
    }
}
