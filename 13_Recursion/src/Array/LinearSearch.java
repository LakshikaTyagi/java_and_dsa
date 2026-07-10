package Array;

import java.util.ArrayList;

public class LinearSearch {
    static void main() {

        int [] arr = {1,6,4,8,3,7,7,7,2,6,6,6,6,16};
        System.out.println(linearSearch(arr,6,0));
        System.out.println(linearSearch(arr,16,0));

        System.out.println(find(arr,6,0));
        System.out.println(find(arr,16,0));

        System.out.println(findAllIndex(arr,7,0));
        System.out.println(findAllIndex(arr,17,0));

        System.out.println(findAllIndex2(arr,7,0));
        System.out.println(findAllIndex2(arr,17,0));


        int [] arr1 = {};
        System.out.println(linearSearch(arr1,2,0));
        System.out.println(find(arr1,2,0));
    }

//    return true or false
    static boolean find(int[] arr, int target, int idx){
        if(idx == arr.length)return false;
        return arr[idx] == target || find(arr,target,idx+1);
    }
//    return index of the first occurence
    static int linearSearch(int [] arr , int target, int idx){
        if(idx == arr.length)return -1;
        else if(arr[idx]== target)return idx;
        else return linearSearch(arr,target,idx+1);
    }


//    return all index of target in an array
    static ArrayList<Integer> findAllIndex(int [] arr , int target, int idx){
        ArrayList <Integer> list = new ArrayList<>();
        return helper(arr,target,idx,list);
    }
    static ArrayList<Integer> helper(int[] arr , int target, int idx, ArrayList<Integer> list){
        if(idx == arr.length)return list;
        if(arr[idx] == target)list.add(idx);
        return helper(arr,target,idx+1,list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length)return list;
        if(arr[idx] == target) list.add(idx);  //this will contain answer for that function call only
        ArrayList<Integer> ans = findAllIndex2(arr,target,idx+1);  //ans from below calls
        list.addAll(ans);
        return list;
    }
}
