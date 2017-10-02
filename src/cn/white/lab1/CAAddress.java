    package cn.white.lab1;

    public class CAAddress implements AddressValidator {
        @Override
        public boolean isValidAddress(String address) {
            String[] arr = address.split(",");
            int addlen = arr.length-1;
            String[] postArr = arr[addlen].split(" ");
            String one = postArr[0];
            String two = postArr[1];
            String regex1 = "[A-Z][0-9][A-Z]";
            String regex2 = "[0-9][A-Z][0-9]";
            if (one.matches(regex1) && two.matches(regex2)) {
                return true;
            }
            return false;
        }
    }
