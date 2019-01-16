package phixma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Res {
    ResultSet res;
    public ResultSet sp_LocalSearch(){
        Statement sql;

        Connection con;

        Conn a=new Conn();
        con=a.getCon();
        try {
            sql=con.createStatement();


        }catch (Exception e){
            e.printStackTrace();
        }

        return res;
    }

    public static void main(String[] args) {
        new Res().sp_LocalSearch();
    }
}
