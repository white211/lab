package cn.white.test.exp2.mysql;


import cn.white.test.exp2.sql.Connection;
import cn.white.test.exp2.sql.Statement;

public class MySQLConnection implements Connection {

    protected MySQLConnection(String url, String user, String password){
        System.out.println("创建了MySQL的Connection对象");
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}





