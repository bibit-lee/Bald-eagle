package phixma3;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BrandResPanel {
    Connection con;
    Statement sql;
    ResultSet res;
    public JPanel brandResPanel(){
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.YELLOW);
        jPanel.setPreferredSize(new Dimension(Item.searchPanel_widht,150));
        Dao dd=new Dao();
        con=dd.getCon();
        try{
            sql=con.createStatement();
            res=sql.executeQuery("SELECT * FROM kcb WHERE spname LIKE '%245%'");
            while (res.next()){
                jPanel.add(new JLabel(res.getString("pp")));

            }
        }catch (Exception e){
            e.printStackTrace();
        }


        return jPanel;
    }
}
