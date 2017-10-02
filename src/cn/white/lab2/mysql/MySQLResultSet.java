package cn.white.lab2.mysql;



import cn.white.lab2.sql.ResultSet;

import java.util.List;
import java.util.Map;


public class MySQLResultSet implements ResultSet {

    private List<Map<String, Object>> rowDatas;
    private int current = -1;

    protected MySQLResultSet(List<Map<String, Object>> rowDatas){
        this.rowDatas = rowDatas;
    }

    @Override
    public boolean next() {
        if (rowDatas == null || rowDatas.size() <= current + 1)
            return false;
        current++;
        return true;
    }

    @Override
    public String getString(String column) {
        return String.valueOf(rowDatas.get(current).get(column));
    }
}
