package cn.white.test.exp2.sql;


public interface ResultSet {

    boolean next();

    String getString(String column);

}
