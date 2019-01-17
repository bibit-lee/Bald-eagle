package phixma3;

import java.sql.*;

public class Dao {
    private Connection con;
    public Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动获取成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=false",
                    "root","root");
            System.out.println("连接数据库成功");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
