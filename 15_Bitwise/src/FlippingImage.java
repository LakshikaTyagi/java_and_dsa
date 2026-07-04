import java.util.Arrays;

public class FlippingImage {
    static void main() {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        reverse(arr);
        System.out.println(Arrays.deepToString(arr));

        int[][] arr1 = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipImage(arr1)));

    }

    static int[][] flipImage(int[][] image){
        reverse(image);
        for (int row = 0; row < image.length; row++){
            for(int i = 0 ; i < image[row].length; i++){
                image[row][i] = 1^image[row][i];
            }
        }
        return image;
    }

    static void reverse(int [][] arr){
        for (int [] row : arr) {
            for (int i = 0; i < row.length/2; i++) {
                swap(row,i, row.length-i-1);
            }
        }
    }

    static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
