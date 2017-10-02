package cn.white.lab1;

public class BinarySearch implements Search{//二分查找

    @Override
    public int findItem(int[] array, int value) {
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int middle = (start+end)/2;
            if(value==array[middle]){
                return middle;
            }else if(value < array[middle]){
                end = middle-1;
            }else{
                start = middle+1;
            }
        }
        return -1;
    }

}
