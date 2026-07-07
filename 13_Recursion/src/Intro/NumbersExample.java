package Intro;

public class NumbersExample {
    static void main() {
//        write a function that takes a number and print numbers upto it
        print(6);
    }

    static void print(int n){
        if(n == 1) {
            System.out.println(n);
        }
        else{
            System.out.print(n + " ");
//            if a function is call again and again , you can treat it as a separate call in stack
            print(n-1);
        }
    }
}
