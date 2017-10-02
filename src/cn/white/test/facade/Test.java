package cn.white.test.facade;

public class Test {
    public static void main(String[] args) {
        AccountManager am = new AccountManager();
        String accName = "abc";
        String accPass = "1243";
        String addr = "gz china";
        String creditInfo = "133246565656";
        am.save(accName, accPass, addr, creditInfo);
    }
}






