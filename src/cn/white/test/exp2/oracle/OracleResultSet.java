package cn.white.test.exp2.oracle;



import cn.white.test.exp2.sql.ResultSet;

import java.util.List;
import java.util.Map;


public class OracleResultSet implements ResultSet {
    private List<Map<String, Object>> rowDatas;
    private int current = -1;

    protected OracleResultSet(List<Map<String, Object>> rowDatas){
        this.rowDatas = rowDatas;
    }

    @Override
    public boolean next() {
        if (rowDatas.size() <= current + 1)
            return false;
        current++;
        return true;
    }

    @Override
    public String getString(String column) {
        return String.valueOf(rowDatas.get(current).get(column));
    }

}






