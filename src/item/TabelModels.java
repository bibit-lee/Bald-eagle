package item;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


public class TabelModels {
    private DefaultTableModel tableModel;
    private JTable jTable;




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

        Tables t=new Tables();
        jTable=t.clientSearchTable(tableModel);

        return jTable;
    }

}