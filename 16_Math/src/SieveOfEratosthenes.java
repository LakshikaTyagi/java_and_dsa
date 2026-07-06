import java.util.Arrays;

public class SieveOfEratosthenes {
    static void main() {

        int b = 100;
        boolean [] arr = new boolean[b+1];

        sieve(b,arr);

        for (int i = 2; i < b; i++) {
            if(!arr[i])System.out.print(i + " " );
        }
    }

//    space complexity : O(n)
//    time complexity : O( n * log(log(n)) )
    static void sieve(int b ,boolean [] arr){
        int c = 2;
        while(c*c <= b){
            if(!arr[c])for (int i = 2; i <= b/c; i++) {
                arr[i*c] = true;
            }
            c++;
        }
    }

}
