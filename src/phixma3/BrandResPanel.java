package phixma3;

import com.mysql.jdbc.RowData;

import javax.swing.*;
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
            res=sql.executeQuery("SELECT * FROM kcb WHERE spname LIKE '%245%'GROUP BY pp");


            while (res.next()){
                List list=new ArrayList();
                Map map=new HashMap();
                ResultSetMetaData md=res.getMetaData();
                String pp=res.getString("pp");
                int column=res.getRow();
                for (int i=1;i<column;i++){
                    map.put(md.getColumnName(i),res.getObject(i));
                }
                list.add(map.get("pp"));
                JLabel[] jLabels=new JLabel[column];
                for (int j=0;j<column;j++){
                    jLabels[j]=new JLabel();
                    jPanel.add(jLabels[j]);
                    String x=list.toString();
                    jLabels[j].setText(x);
                }

                }


        }catch (Exception e){
            e.printStackTrace();
        }


        return jPanel;
    }
}
