package cn.white.test.exp2.sql;

public class DriverManager {

    private static Driver driverRef;

    public static void loadDriver(Driver driver){
        driverRef = driver;
    }

    public static Connection getConnection(String url, String user, String password){
        return driverRef.connect(url, user, password);
    }
}








