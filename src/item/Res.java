package item;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Res {  //创建数据集类

    public ResultSet getSPLocalSearchRes(){    //获取本地数据集方法

        ResultSet res=null;    //声明数据集类对象
        Conn a=new Conn();   //实例化连接类对象
        Connection con=a.getCon();  //获取数据库连接类实例方法
        //必须要捕捉连接过程的异常
        try {
            Statement sql=con.createStatement();  //实例化 Statment类接口对象
        }catch (Exception e){
            e.printStackTrace();
        }

        return res;  //返回本地数据集
    }

    //创建主窗体顶部标题类数据获取方法
    public ResultSet getToplabelRes(){

        ResultSet toplabel=null;  //实例化数据集对象
        Conn a=new Conn();   //实例化连接类对象
        Connection con1=a.getCon1();  //获取标题类标签实例方法
        //必须要捕捉连接过程的异常
        try{
            Statement sql=con1.createStatement();  //实例化接口类对象
            toplabel=sql.executeQuery("SELECT * FROM toplabel WHERE id=1");  //执行SQL语句，返回顶部标题数据集

        }catch (Exception e){
            e.printStackTrace();
        }
        return toplabel;  //返回标题数据集对象
    }

    public ResultSet getC5Recommend(){
        ResultSet recommend=null;
        Conn a=new Conn();   //实例化连接类对象
        Connection con=a.getCon1();

        try {
            Statement sql=con.createStatement();
            recommend=sql.executeQuery("SELECT * FROM recommend ORDER BY id DESC LIMIT 10");

        }catch (Exception e){
            e.printStackTrace();
        }
        return recommend;
    }

    public ResultSet gettopTransaction6(){

        ResultSet topTransaction6=null;
        Conn a=new Conn();   //实例化连接类对象
        Connection con=a.getCon();
        try{
            Statement sql=con.createStatement();
            topTransaction6=sql.executeQuery("SELECT * FROM client ORDER BY TransactionLastMonth DESC LIMIT 6");

        }catch (Exception e){
            e.printStackTrace();
        }
        return topTransaction6;
    }


}
