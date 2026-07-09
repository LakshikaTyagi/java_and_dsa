package easy;

public class Reverse {

    static int rev = 0;

    static void main() {
        System.out.println(reverse(123));
        System.out.println(reverse(1004));

        System.out.println(reverse2(342));
        System.out.println(reverse2(3956));

        System.out.println(reverse3(1234));
        System.out.println(reverse3(8974));
    }

//    sometimes you need additional variables in the argument , in that case make another function
    static int reverse(int n){
        int digits = (int) Math.log10(n) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n < 10)return n;
        return (n%10) * Math.powExact(10,digits-1) + helper(n/10,digits-1);
    }

    static int reverse2(int n){
        if(n == 0) {
            int temp = rev;
            rev = 0;
            return temp;
        }
        rev =  rev*10 + n%10;
        return reverse2(n/10);
    }

    static int reverse3(int n){
        if(n < 10)return n;
//        int a = n/10;
        int p = (int) Math.log10(n);
        int m = ((n%10) * Math.powExact(10,p));
        return m + reverse3(n/10);
    }
}
