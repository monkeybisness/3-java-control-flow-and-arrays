package com.example.task11;

import java.lang.reflect.Array;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if (arr == null || arr.length == 0){
            return;
        }
        int temp = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
                count = i;
            }
        }
        arr[count] = arr[0];
        arr[0] = temp;
    }

}