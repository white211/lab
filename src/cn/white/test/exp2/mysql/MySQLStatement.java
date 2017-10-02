package cn.white.test.exp2.mysql;


import cn.white.test.exp2.db.Database;
import cn.white.test.exp2.sql.ResultSet;
import cn.white.test.exp2.sql.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MySQLStatement implements Statement {

    protected MySQLStatement(){
        System.out.println("创建了MySQL的Statement");
    }

    @Override
    public ResultSet executeQuery(String sql) {
        System.out.println("执行SQL语句："  + sql);
        List<Map<String, Object>> rowDatas = Database.exec(sql);
        return new MySQLResultSet(rowDatas);
    }
}
