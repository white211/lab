package cn.white.test.exp2.mysql;


import cn.white.test.exp2.sql.Connection;
import cn.white.test.exp2.sql.Driver;
import cn.white.test.exp2.sql.DriverManager;


public class MySQLDriver implements Driver {

    static {
        DriverManager.loadDriver(new MySQLDriver());
    }

    private MySQLDriver(){}

    @Override
    public Connection connect(String url, String user, String password) {
        System.out.println("连接到mysql...");
        return new MySQLConnection(url, user, password);
    }
}




