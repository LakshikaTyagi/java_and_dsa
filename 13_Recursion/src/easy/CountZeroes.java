package easy;

public class CountZeroes {
    static void main() {
        System.out.println(count(10000));
        System.out.println(count(0));
        System.out.println(count(30210004));
        System.out.println(count(1234));
    }

    static int count(int n){
        if(n == 0)return 1;
        return helper(n,0);
    }

    private static int helper(int n, int ans){
        if(n == 0)return ans;
        if(n%10 == 0)return helper(n/10,ans+1);
        else return helper(n/10,ans);
    }
}
