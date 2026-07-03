public class NoOfDigits {
    static void main() {

        System.out.println(log(10,16));
        System.out.println(noOfDigits(50,2));
        System.out.println(noOfDigits(34566754,16));
    }

    static double log(int n , int b){
        return Math.log(n)/Math.log(b) ;
    }

    static int noOfDigits(int n, int b){
        double digit = log(n,b) + 1;
        return (int)digit;
    }
}
