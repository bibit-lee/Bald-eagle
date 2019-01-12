package phixma3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LocalResPanel {
    Connection con;
    Statement sql;
    ResultSet res;
    public JPanel localResPanel(){
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.PINK);
        jPanel.setPreferredSize(new Dimension(Item.searchPanel_widht,400));
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        Dao d=new Dao();
        con=d.getCon();

        try{

            sql=con.createStatement();
            res=sql.executeQuery("SELECT*FROM kcb WHERE spname LIKE '%245%'");
            DefaultTableModel tableModel=new DefaultTableModel();
            JTable jTable=new JTable(tableModel);
            tableModel.setColumnIdentifiers(new Object[]{" "," "," "});//设置表格头名称
            jTable.setPreferredSize(new Dimension(800,300));
            jPanel.add(jTable);

            while (res.next()){
                String id=res.getString("id");
                String pp=res.getString("pp");
                String spname=res.getString("spname");
                tableModel.addRow(new Object[]{id,pp,spname});
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return jPanel;
    }
}
