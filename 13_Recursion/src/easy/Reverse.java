package easy;

public class Reverse {

    static int rev = 0;

    static void main() {
        System.out.println(reverse(123,0));
        System.out.println(reverse(1004,0));

        System.out.println(reverse2(342));
        System.out.println(reverse2(3956));

        System.out.println(reverse3(1234));
        System.out.println(reverse3(8974));
    }

    static int reverse(int n,int r){
        if(n == 0)return r;
        int m = n%10 + r*10;
        return reverse(n/10,m);
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
