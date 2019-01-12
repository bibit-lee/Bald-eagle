package phixma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlResultSet {
    static ResultSet res;
    Connection con;
    public ResultSet getRes(){
        MysqlConnection x=new MysqlConnection();
        con=x.getCon();
        try {
            String neirong=SearchPanel.jTextField.getText();  //获取文本框输入的值
            Statement sql=con.createStatement();
            res=sql.executeQuery("SELECT * FROM kcb WHERE spname LIKE '%245%'");

        }catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }
}
