package easy;

public class PalindromeDigits {
    static void main() {

        System.out.println(palindrome_digits(12321));

        String a = "hello";
        StringBuilder b = new StringBuilder("hello");
//        System.out.println(a.contentEquals(b));  //true

        System.out.println(palindrome_string("naman"));
        System.out.println(palindrome_string("abcd"));
    }

    static boolean palindrome_digits(int n){
        return n == rev(n);
    }

    static int rev(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n < 10)return n;
        return (n%10)*Math.powExact(10,digits-1) + helper(n/10,digits-1);
    }

    //    without recursion for strings
    static boolean palindrome_string(String s){
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        return s.contentEquals(rev);
    }


}
