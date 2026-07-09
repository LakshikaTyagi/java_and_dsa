package Array;

public class CheckSortedArray {
    static void main() {
        System.out.println(check(new int[]{1, 2, 4, 8, 9, 12}));
        System.out.println(check(new int[]{1, 2, 4, 4,8,8, 9,8, 12}));
        System.out.println(check(new int[]{5,4,4,3,3,2,1}));
    }

    static boolean check(int[] arr){
        if(arr == null)return true;
        return compare_asc(arr,0) || compare_dsc(arr,0);
    }

    static boolean compare_dsc(int[] arr, int idx) {
        if(idx == arr.length-1)return true;
        if(arr[idx] >= arr[idx+1])return compare_dsc(arr,idx+1);
        else return false;
    }

    static boolean compare_asc(int [] arr, int idx){
        if(idx == arr.length-1)return true;
        return (arr[idx]<=arr[idx+1] ) && compare_asc(arr,idx+1);
//        if(arr[idx] <= arr[idx+1])return compare_asc(arr,idx+1);
//        else return false;
    }
}
