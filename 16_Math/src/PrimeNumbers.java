public class PrimeNumbers {
    static void main() {
        System.out.println(isPrime(13));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));

    }

    static boolean checkPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0)return false;
        }
        return true;
    }

    static boolean isPrime(int n){
        if(n <= 1)return false;
        int root = (int)Math.sqrt(n);
        for(int i = 2; i <= root; i++){
            if(n%i == 0)return false;
        }
        return true;
    }
}
