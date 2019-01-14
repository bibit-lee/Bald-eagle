package phixma3;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.*;
import java.util.List;

public class BrandResPanel {
    Connection con;
    Statement sql;
    ResultSet res;
    public JPanel brandResPanel(){
        JPanel jPanel=new JPanel();
        jPanel.setBackground(Color.YELLOW);
        jPanel.setPreferredSize(new Dimension(Item.searchPanel_widht,150));
        jPanel.setLayout(new GridLayout(3,5,5,5));
        Dao dd=new Dao();
        con=dd.getCon();
        try{
            sql=con.createStatement();
            res=sql.executeQuery("SELECT * FROM kcb WHERE spname LIKE '%245%'");
            while (res.next()){
                String pp=res.getString("pp");
                ResultSetMetaData md=res.getMetaData();
                int columnCount=md.getColumnCount();
                Set set=new HashSet();
                Map rowData=new HashMap();
                for (int i=1;i<=columnCount;i++){
                    rowData.put(md.getColumnName(i),res.getObject(i));
                }
                set.add(rowData.get("pp"));
                System.out.println(set);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return jPanel;
    }
}
