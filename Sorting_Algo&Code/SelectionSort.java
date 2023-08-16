package Sort_Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={-4, 2, 10, 5, -9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int maxIndex = maxNum(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int firstNum, int secondNum) {
        int temp = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp;
    }

    static int maxNum(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    } 
}
