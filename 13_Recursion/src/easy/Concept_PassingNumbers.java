package easy;

public class Concept_PassingNumbers {

    static void main() {
        func(5);
    }

    static void func(int n){
        if(n == 0)return;
        System.out.println(n);

//        func(n--);  //Permanently decreases the value of n by 1, but returns the original (old) value for the immediate calculation.

//        func(--n);   // Permanently decreases the value of n by 1, and returns the newly decreased value for the immediate calculation

        func(n-1);  //Evaluates to the value of n minus 1, but does not change the value stored inside the variable n itself.
    }
}
