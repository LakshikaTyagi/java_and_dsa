package CycleSort_Quesn;

public class MissingNumber {
    static void main() {

        int [] arr = {4,0,2,1};
        System.out.println(missingNumber(arr));

        int [] arr1 = {0,1};
        System.out.println(missingNumber(arr1));

    }
    static void sortArray(int [] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == n || arr[i] == i){
                i++;
            }
            else{
                int req_idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[req_idx];
                arr[req_idx] = temp;
            }
        }
    }

    static int missingNumber(int [] arr){
        sortArray(arr);
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == i){
                i++;
            }
            else{
                return i;
            }
        }
        return i;
    }
}
