package cn.white.lab2.oracle;

import cn.white.lab2.sql.Connection;
import cn.white.lab2.sql.Driver;
import cn.white.lab2.sql.DriverManager;


public class OracleDriver implements Driver {

    static {
        DriverManager.loadDriver(new OracleDriver());
    }

    private OracleDriver() {
    }

    @Override
    public Connection connect(String url, String user, String password) {
        System.out.println("连接到oracle...");
        return new OracleConnection(url, user, password);
    }
}


















