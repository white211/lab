package cn.white.test.exp2.sql;


public interface Driver {

    Connection connect(String url, String user, String password);
}
