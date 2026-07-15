package CycleSort_Quesn;

import java.util.ArrayList;

class Solution {
    static void main() {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

        int [] arr2 = {1,1};
        System.out.println(findDisappearedNumbers(arr2));


    }

    static void swap(int [] arr, int a1, int a2){
        int temp = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = temp;
    }

    static void sort(int [] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] -1 == i || arr[i] > arr.length){
                i++;
            }
            else{
                int crr_idx = arr[i] - 1;
                if(arr[crr_idx] == arr[i]){
                    i++;
                }
                else{
                    swap(arr,i,crr_idx);
                }
            }
        }
    }

    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>(1);
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] - 1 != i){
                list.add(i+1);
            }
        }
        return list;
    }
}