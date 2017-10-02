package cn.white.test.exp2.test;

import cn.white.test.exp2.sql.Connection;
import cn.white.test.exp2.sql.DriverManager;
import cn.white.test.exp2.sql.ResultSet;
import cn.white.test.exp2.sql.Statement;

/**
 * Created by sumhi on 2017/10/1.
 */
public class OracleTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("cn.white.test.exp2.oracle.OracleDriver");
        Connection conn = DriverManager.getConnection("xx","xx","xx");
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from user where gender = '男' and code = '201421314315' ");
        int idx = 1;
        while(rs.next()){
            System.out.println("记录"+String.valueOf(idx++));
            System.out.println("name: " + rs.getString("name"));
            System.out.println("code: " + rs.getString("code"));
            System.out.println("gender: " + rs.getString("gender"));
        }
    }
}
