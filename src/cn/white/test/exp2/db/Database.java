package cn.white.test.exp2.db;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Database {
    private static Map<String, List<Map<String, Object>>> tables;

    static {
        List<Map<String, Object>> rowDatas = new ArrayList<>();
        Map<String, Object> map;
        map = new HashMap<>();
        map.put("code", "201421314313");
        map.put("name", "黄彩怡");
        map.put("gender", "女");
        rowDatas.add(map);
        map = new HashMap<>();
        map.put("code", "201421314314");
        map.put("name", "黄浩贤");
        map.put("gender", "男");
        rowDatas.add(map);
        map = new HashMap<>();
        map.put("code", "201421314315");
        map.put("name", "黄夏宇");
        map.put("gender", "男");
        rowDatas.add(map);
        tables = new HashMap<>();
        tables.put("user", rowDatas);
    }

    public static List<Map<String, Object>> exec(String sql) {
        String table = getTable(sql);
        Map<String, Object> conditions = getCondition(sql);
        List<Map<String, Object>> datas = tables.get(table);
        List<Map<String, Object>> res = new ArrayList<>();
        datas.stream().filter(item -> conditions.size() == 0 || conditions.keySet().stream().allMatch(k -> item.containsKey(k) && item.get(k).equals(conditions.get(k)))).forEach(res::add);
        return res;
    }

    private static String getTable(String sql) {
        String re = "(?<=from).*";
        if (sql.contains("where"))
            re += "(?=where)";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(sql);
        if (matcher.find()) {
            return matcher.group().trim();
        } else {
            return null;
        }
    }

    private static Map<String, Object> getCondition(String sql) {
        if (!sql.contains("where"))
            return Collections.EMPTY_MAP;
        Pattern pattern = Pattern.compile("(?<=where).*");
        Matcher matcher = pattern.matcher(sql);
        if (matcher.find()) {
            String where = matcher.group();
            String[] conds = where.split("and");
            Map<String, Object> res = new HashMap<>();
            for (String cond : conds) {
                String[] params = cond.split("[=]");
                res.put(params[0].trim(), params[1].trim().replace("'", ""));
            }
            return res;
        }

        return Collections.EMPTY_MAP;
    }

    public static void main(String[] args) {
        String table = getTable("select * from user where a");
        System.out.println(table);
        getCondition("select * from user where a = 10 and b = 10");
    }

}
