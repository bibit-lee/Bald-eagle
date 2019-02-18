package item;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Res {  //创建数据集类
    static Conn a=new Conn();   //实例化连接类对象
    ResultSet res;    //声明数据集类对象
    private ResultSet topTransaction6;


    public ResultSet getSPLocalSearchRes(){    //获取本地数据集方法
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
        Connection con=a.getCon1();

        try {
            Statement sql=con.createStatement();
            recommend=sql.executeQuery("SELECT * FROM recommend ORDER BY id DESC LIMIT 10");

        }catch (Exception e){
            e.printStackTrace();
        }
        return recommend;
    }
    public ResultSet client(){
        ResultSet client =null;
        Connection con=a.getCon();

        try{
            String s=TextFields.j2ClientSearchFieldText;
            Statement sql=con.createStatement();
            client=sql.executeQuery("SELECT * FROM client WHERE Initials LIKE '%"+s+"%'");
        }catch (Exception e){
            e.printStackTrace();
        }
        return client;
    }

    public void settopTransaction6(ResultSet topTransaction6){

        this.topTransaction6=topTransaction6;

    }
    public ResultSet gettopTransaction6(){
        Connection con=a.getCon();
        try{
            Statement sql=con.createStatement();
            topTransaction6=sql.executeQuery("SELECT * FROM client ORDER BY TransactionLastMonth DESC LIMIT 6");

        }catch (Exception e){
            e.printStackTrace();
        }
        return topTransaction6;
    }

    public static void main(String[] args) {
        new Res().gettopTransaction6();
    }

}
