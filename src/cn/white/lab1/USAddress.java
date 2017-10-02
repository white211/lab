package cn.white.lab1;

public class USAddress implements AddressValidator {
    @Override
    public boolean isValidAddress(String address) {
        String[] array = address.split(",");
        int key = array.length - 1;
        String[] postNum = array[key].split(" ");
        String regex = "\\d{5}";
        if (postNum[1].matches(regex)) {
            return true;
        }
        return false;
    }
}
