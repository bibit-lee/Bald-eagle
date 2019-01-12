package phixma;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 * Created by lb200 on 2019-01-10.
 */
public class ResTable {
    static ResultSet res;
    public JTable ResTable(){
        MysqlResultSet a=new MysqlResultSet();
        res=a.getRes();
        DefaultTableModel tableModel=new DefaultTableModel();
        JTable jTable=new JTable(tableModel);
        jTable.setSize(400,400);
        try {
            while (MysqlResultSet.res.next()){
                String id=MysqlResultSet.res.getString("id");  //获取列名是 id 的字段
                String pp=MysqlResultSet.res.getString("pp");  //获取列名是 pp 的字段
                String spname=MysqlResultSet.res.getString("spname");  //获取列名是 spname 的字段
                String dw=MysqlResultSet.res.getString("dw");  //获取列名是 dw 的字段
                tableModel.addRow(new Object[]{"id","pp","spname","dw"});
                System.out.println(spname);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        return jTable;
    }

    public static void main(String[] args) {
        new ResTable().ResTable();
    }
}
