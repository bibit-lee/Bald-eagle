package phixma;


import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {   //创建数据库连接类
    static Connection con;  //声明本地数据库连接对象
    static Connection con2;  //声明外部数据库连接对象

    /*
    本地数据连接构造方法
     */
    public Connection getCon(){
        //捕捉数据库驱动加载过程中的异常
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //捕捉数据库连接路径异常
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=true","root","root");
            System.out.println("数据库连接成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;  //返回本地数据库连接对象
    }


    /*
    外部数据库连接构造方法
     */
    public Connection getCon2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            con2=DriverManager.getConnection("");
            System.out.println("数据库连接成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return con2;  //返回外部数据库连接对象
    }
}
