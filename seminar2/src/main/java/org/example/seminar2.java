package org.example;

import java.util.Arrays;
import java.util.Random;

public class seminar2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for(int i=0; i<array.length; i++) {
            array[i] = rand.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(array));
        int[] result_array = ArrayReverse(array);
        System.out.println(Arrays.toString(result_array));

    }
    static int[] ArrayReverse(int[] arr) {
        int[] array_reverse = new int[arr.length];
        int j = arr.length-1;
        for(int i = 0; i<arr.length; i++) {
            array_reverse[i] = arr[j];
            j--;
        }
        return array_reverse;
    }
}