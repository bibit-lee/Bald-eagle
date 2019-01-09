package phixma;

import com.sun.jdi.connect.spi.Connection;

public class ShuJuKuLianJie {
    public Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }
    }
}
