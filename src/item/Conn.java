package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {                                  //创建连接类

    public Connection getCon(){                      //连接方法
        Connection con=null;                          //声明连接类对象
        try {                                        //捕捉异常
            Class.forName("com.mysql.jdbc.Driver");  //加载数据库驱动
            System.out.println("数据库驱动加载成功");    //输出加载驱动信息
        }catch (ClassNotFoundException e){            //输出异常
            e.printStackTrace();
        }
        try {                                         //捕捉异常
            /*验证数据库路径、用户名、密码*/
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=false",
                    "root","root");
            System.out.println("数据库连接成功");        //输出连接信息
        }catch (SQLException e){                      //输出异常
            e.printStackTrace();
        }

        return con;
    }

    public Connection getCon1(){                      //连接方法
        Connection con1=null;                          //声明连接类对象
        try {                                        //捕捉异常
            Class.forName("com.mysql.jdbc.Driver");  //加载数据库驱动
            System.out.println("数据库驱动加载成功");    //输出加载驱动信息
        }catch (ClassNotFoundException e){            //输出异常
            e.printStackTrace();
        }
        try {                                         //捕捉异常
            /*验证数据库路径、用户名、密码*/
            con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/waibu?characterEncoding=utf-8&useSSL=false",
                    "root","root");
            System.out.println("数据库连接成功");        //输出连接信息
        }catch (SQLException e){                      //输出异常
            e.printStackTrace();
        }
        return con1;                                     //返回连接
    }

}
