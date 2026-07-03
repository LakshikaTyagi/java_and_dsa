public class OddFindingNumber {
    static void main() {

//        int n = Integer.parseInt((Integer.toBinaryString(10)));

//        System.out.println(n);  //1010

        int [] arr = {2,6,11,6,2,2,6};
        System.out.println(findUnique(arr));

    }

    static int findUnique(int [] arr){
        int sum = 0;
        for(int n : arr){
            sum += Integer.parseInt(Integer.toBinaryString(n));
        }
        StringBuilder ans = new StringBuilder();
        while(sum > 0){
            int rem = sum%10;
            ans.append(rem%3);
            sum = sum/10;
        }
        ans.reverse();
        String ans1 = ans.toString();
        int res = Integer.parseInt(ans1,2);
        return res;
    }

}
