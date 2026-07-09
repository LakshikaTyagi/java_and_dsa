package Array;

public class LinearSearch {
    static void main() {

        int [] arr = {1,6,4,8,3,7,2,16};
        System.out.println(linearSearch(arr,6,0));
        System.out.println(linearSearch(arr,16,0));
        System.out.println(find(arr,6,0));
        System.out.println(find(arr,16,0));

        int [] arr1 = {};
        System.out.println(linearSearch(arr1,2,0));
        System.out.println(find(arr1,2,0));
    }

    static boolean find(int[] arr, int target, int idx){
        if(idx == arr.length)return false;
        return arr[idx] == target || find(arr,target,idx+1);
    }
    static int linearSearch(int [] arr , int target, int idx){
        if(idx == arr.length)return -1;
        else if(arr[idx]== target)return idx;
        else return linearSearch(arr,target,idx+1);
    }
}
