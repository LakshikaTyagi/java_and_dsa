public class PrimeNumbers {
    static void main() {
        System.out.println(checkPrime(13));
        System.out.println(checkPrime(93));
        System.out.println(checkPrime(73));

    }

    static boolean checkPrime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0)return false;
        }
        return true;
    }
}
