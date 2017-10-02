package cn.white.test.exp2.oracle;

import cn.white.test.exp2.sql.Connection;
import cn.white.test.exp2.sql.Statement;

public class OracleConnection implements Connection {

    protected OracleConnection(String url, String user, String password) {
        System.out.println("创建了Oracle的Connection对象");
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}














