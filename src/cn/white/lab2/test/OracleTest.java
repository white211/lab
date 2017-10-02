package cn.white.lab2.test;

import cn.white.lab2.sql.Connection;
import cn.white.lab2.sql.DriverManager;
import cn.white.lab2.sql.ResultSet;
import cn.white.lab2.sql.Statement;


public class OracleTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("cn.white.lab2.oracle.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:3306:test","root","root");
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from user where gender = '男' and sno = '201421314301' ");
        int idx = 1;
        while(rs.next()){
            System.out.println("记录"+String.valueOf(idx++));
            System.out.println("name: " + rs.getString("name"));
            System.out.println("sno: " + rs.getString("sno"));
            System.out.println("gender: " + rs.getString("gender"));
        }
    }
}
