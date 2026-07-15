package Pattern;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {2,4,6,8,1,3,5,7};
        selectionSort(arr1, arr1.length-1, 0,0);
        System.out.println(Arrays.toString(arr1));
    }

    static void selectionSort(int[] arr, int r, int c, int max){
        if(r == 0)return;
        if(c <= r){
            if(arr[c] > arr[max])max = c;
            selectionSort(arr,r,c+1,max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[c-1];
            arr[c-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
