package phixma;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class MysqlResultSet {
    static PreparedStatement sql;
    static Statement sql2;
    static ResultSet res;
    public ResultSet getRes(){
        try {
            String neirong=SearchPanel.jTextField.getText();  //获取文本框输入的值
            sql=MysqlConnection.con.prepareStatement("SELECT * FROM kcb WHERE spname LIKE '%"+neirong+"%'");
            res=sql.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
