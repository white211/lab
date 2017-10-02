package cn.white.lab2.test;


import cn.white.lab2.sql.Connection;
import cn.white.lab2.sql.DriverManager;
import cn.white.lab2.sql.ResultSet;
import cn.white.lab2.sql.Statement;

public class MySQLTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("cn.white.lab2.mysql.MySQLDriver");
        Connection conn = DriverManager.getConnection("127.0.0.1:80/jdbc:mysql/3306","root","root");
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from user");
        int idx = 1;
        while(rs.next()){
            System.out.println("记录"+String.valueOf(idx++));
            System.out.println("name: " + rs.getString("name"));
            System.out.println("gender: " + rs.getString("gender"));
        }
    }

}
