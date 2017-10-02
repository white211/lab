package cn.white.lab1;

public class TestAddressValidator {
    public static void main(String[] args) {
        AddressValidator usa = new USAddress();
        AddressValidator caa = new CAAddress();
        String USAddress1 = "11965 Venice Blvd.Suite 405,Los Angeles,CA 90066";
        String USAddress2 = "11965 Venice Blvd.Suite 405,Los Angeles,CA 900AA";
        String CAAddress1 = "123 ABC Street，VANCOUVER,BC,V7E 1W2";
        String CAAddress2 = "123 ABC Street，VANCOUVER,BC,V77 122";
        boolean USresult = usa.isValidAddress(USAddress1);
        boolean CAresult = caa.isValidAddress(CAAddress1);
        if (USresult){
            System.out.println("美国邮编正确");
        }else{
            System.out.println("美国邮编错误");
        }
        if (CAresult){
            System.out.println("加拿大邮编正确");
        }else{
            System.out.println("加拿大邮编错误");
        }
    }
}
