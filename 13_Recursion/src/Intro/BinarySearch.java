package Intro;

public class BinarySearch {
    static void main() {

        int [] arr = {2,3,4,5,6,7};
        System.out.println(binarySearch(arr,7,0,arr.length-1));
        System.out.println(binarySearch(arr,-7,0,arr.length-1));

    }

    static int binarySearch(int[] arr, int target,int start , int end){
        if(end < start)return -1;
        else{
            int mid = start + (end - start)/2;
            if(arr[mid] == target)return mid;
            else if(arr[mid] > target) return binarySearch(arr,target,start,mid-1);
            else  return binarySearch(arr,target,mid+1,end);
//            make sure to return thr result of a function call of the return type
        }
    }
}

