package Intro;

public class Fibonacci {
    static void main() {

        System.out.println(fib(7));

    }

    static int fib(int n){
        if(n < 2)return n;
        return fib(n-1) + fib(n-2);
    }
}
