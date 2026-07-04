public class SumInPascalTriangle {
    static void main() {

        pascalTriangle(7);

        System.out.println(sum(1) + " " + sum2(2));
        System.out.println(sum(3) + " " + sum2(4));
        System.out.println(sum(5) + " " + sum2(6));
        System.out.println(sum(7) + " " + sum2(8));

    }

    static int factorial(int n){
        if(n < 2)return 1;
        return n*factorial(n-1);
    }

    static int combination(int n, int r){
        int num = factorial(n);
        int deno = factorial(r)*factorial(n-r);
        return num/deno;
    }

    static void pascalTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i,j) + " ");
            }
            System.out.println();
        }
    }

    static int sum(int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += combination(n-1,i);
        }
        return s;
    }

//    using binary operator
    static int sum2(int n){
        int s = 1 << (n-1);
        return s;
    }
}
