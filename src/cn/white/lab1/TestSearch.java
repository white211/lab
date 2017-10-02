package cn.white.lab1;

public class TestSearch {
    public static void main(String[] args) {
        int [] array = {12,23,34,45,56,67,78,89};
        int key = 45;
        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(binarySearch.findItem(array,key));
        System.out.println(linearSearch.findItem(array,key));
    }
}
