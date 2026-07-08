package easy;

public class SumOfDigits {

    static void main() {
        System.out.println(digits_sum(1342));
    }

    static int digits_sum(int n){
        if(n == 0)return 0;
        return n%10 + digits_sum(n/10);
    }
}
