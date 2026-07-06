import java.util.ArrayList;

public class Factors {
    static void main() {

        factors1(36);
        factors2(36);
        factors3(36);

        factors1(13);
        factors2(13);
        factors3(13);
    }

    static void factors1(int n){
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    static void factors2(int n){
        int r = (int) Math.sqrt(n);
        for (int i = 1; i <= r; i++) {
            if(n%i == 0) {
                if(i*i == n) System.out.print(i + " ");
                else System.out.print(i + " " + n / i + " ");
            }
        }
        System.out.println();
    }

    static void factors3(int n){
        ArrayList <Integer> roots = new ArrayList<>(2);
        int r = (int) Math.sqrt(n);

        for (int i = 1; i <= r; i++) {
            if(n%i == 0){
                if(i*i == n)roots.add(i);
                else {
                    roots.add(i);
                    roots.add(n/i);
                }
            }
        }
        roots.sort(null);
        System.out.println(roots);
    }
}
