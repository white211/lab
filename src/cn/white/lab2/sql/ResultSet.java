package cn.white.lab2.sql;


public interface ResultSet {

    boolean next();

    String getString(String column);

}
