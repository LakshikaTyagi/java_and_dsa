package CycleSort_Quesn;

import java.util.Arrays;

public class SetMismatch {
    static void main() {

        int [] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));

        int [] arr1 = {3,2,2};
        System.out.println(Arrays.toString(findErrorNums(arr1)));

    }

    static void sort(int [] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] - 1 == i)i++;
            else{
                int idx = arr[i] - 1;
                if(arr[i] == arr[idx])i++;
                else{
                    int temp = arr[idx];
                    arr[idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    static int[] findErrorNums(int [] nums){
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] - 1 != i){
                return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
}
