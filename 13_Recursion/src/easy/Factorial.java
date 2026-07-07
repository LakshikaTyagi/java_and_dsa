package easy;

public class Factorial {
    static void main() {

        System.out.println(factorial(4));
    }

    static int factorial(int n){
        if(n < 2)return 1;
        return n*factorial(n-1);
    }
}
