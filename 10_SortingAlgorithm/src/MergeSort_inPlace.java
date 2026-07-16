import java.util.Arrays;

public class MergeSort_inPlace {
    static void main() {

        int[] arr = {4,3,2,1,0};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSortInPlace(int [] arr, int s, int e){
        if( e - s == 1)return ;

        int mid = s + (e-s)/2;

        mergeSortInPlace(arr,s,mid);  //mid is exclusive
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int[] arr , int s, int m , int e){
        int[] mix = new int[e-s];
        int i = s, j = m, k = 0;
        while(i < m && j < e){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0; k < mix.length; k++) {
            arr[s+k] = mix[k];
        };

    }
}
