package CycleSort_Quesn;

public class FirstMissingPositive {
    static void main() {

        int [] arr = {1,2,0};
        System.out.println(firstMissing(arr));

        int [] arr1 = {3,4,-1,1};
        System.out.println(firstMissing(arr1));

        int[] arr2 = {7,8,9,11,12};
        System.out.println(firstMissing(arr2));

        int[] arr3 = {1};
        System.out.println(firstMissing(arr3));

        int [] arr4 = {};
        System.out.println(firstMissing(arr4));


    }

    static void sort(int [] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] <= 0){
                i++;
            }
            else if(arr[i] - 1 == i || arr[i] > arr.length){
                i++;
            }
            else{
                int idx = arr[i] - 1;
                if(arr[i] == arr[idx])i++;
                else{
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }
            }
        }
    }

    static int firstMissing(int [] nums){
        sort(nums);
        int i = 0;
        for ( i = 0; i < nums.length; i++) {
            if(nums[i]  != i + 1 )return i+1;
        }
        return i+1;
    }
}
