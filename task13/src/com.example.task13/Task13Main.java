package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if(arr == null || arr.length == 0){
            return arr;
        }
        int size = 0;
        for (int elem: arr){
            if(elem <= 1000){
                size ++;
            }
        }
        int[] newArr = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length ; i++ ){
            if (arr[i] <= 1000){
                newArr[count] = arr[i];
                count ++;
            }
        }
        return newArr;
    }
}