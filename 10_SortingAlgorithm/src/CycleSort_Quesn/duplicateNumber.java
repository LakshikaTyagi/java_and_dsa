package CycleSort_Quesn;

public class duplicateNumber {
    static void main() {

        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));

        int [] arr1 = {3,1,3,4,2};
        System.out.println(findDuplicate(arr1));

        int[] arr2 = {3,3,3,3,3};
        System.out.println(findDuplicate(arr2));
    }

    static void sort(int [] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] - 1 == i){
                i++;
            }
            else{
                int idx = arr[i] - 1;
                if(arr[i] == arr[idx]){
                    i++;
                }
                else {
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }

            }
        }
    }

    static int findDuplicate(int[] nums){
        sort(nums);
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if(nums[i] - 1 != i)return nums[i];
        }
        return i;
    }
}
