package Pattern_Sorting;

public class Triangle {

    static void main() {
        triangle1(5);
        triangle2(5,0);
    }

    static void triangle1(int n) {
        if (n == 0) return;
        cols1(n);
        triangle1(n - 1);
    }

    private static void cols1(int n) {
        if (n == 1) {
            System.out.println("* ");
            return;
        }
        System.out.print("* ");
        cols1(n - 1);
    }

    static void triangle2(int r, int c) {
        if(r == 0)return;
        if(c < r){
            triangle2(r,c+1);
            System.out.print("* ");
        }
        else{
            triangle2(r-1,0);
            System.out.println();
        }
    }

}
