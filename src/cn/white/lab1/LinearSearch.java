package cn.white.lab1;

public class LinearSearch implements Search {
    @Override
    public int findItem(int[] array, int value) {
       for(int i = 0;i<array.length-1;i++){
           if(value == array[i]){
               return  i;
           }
       }
       return  -1;
    }
}
