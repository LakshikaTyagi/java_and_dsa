package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void main() {

        int [] arr = {6,5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = {2,5,4,2,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }

    static void quicksort(int [] arr, int low , int high){
        if(low >= high)return ;
        int s = low, e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s <= e){
//            also a reason why if it's already sorted it will not swap
            while(arr[s] < pivot)s++;
            while(arr[e] > pivot) e--;

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

//        now my pivot is at correct index , sort the other halves
        quicksort(arr,low , e);
        quicksort(arr,s,high);
    }
}
