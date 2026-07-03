public class EvenFindingNumber {
    static void main() {
//        we are given an array in which every number appears twice except one number , we have to find that one number

        int [] arr = {2,3,4,2,1,1,3,6,4};
//        in this array except 6, every number appears twice, so 6 is the answer

        System.out.println(findNum(arr));

        int []arr1 = new int[]{1, 2, 3, 1, 4, 6, 4, 6,3};
        System.out.println(findNum(arr1));  //not working for negative duplicates
    }

    static int findNum(int [] arr){
        int m = 0;
        for (int j : arr) {
            m = m ^ j;
        }
        return m;
    }
}
