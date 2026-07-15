package CycleSort_Quesn;

import java.util.ArrayList;

public class duplicateNumbers {
    static void main() {

        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));

        int [] arr1 = {1,1,2};
        System.out.println(findDuplicates(arr1));

        int [] arr2 = {1};
        System.out.println(findDuplicates(arr2));
    }

    static void sort(int [] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] - 1 == i)i++;
            else {
                int idx = arr[i] - 1;
                if(arr[idx] == arr[i])i++;
                else{
                    int temp = arr[idx];
                    arr[idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    static ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList <Integer> list = new ArrayList<>(1);
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - 1 != i){
                list.add(arr[i]);
            }
        }
        list.sort(null);
        return list;
    }
}
