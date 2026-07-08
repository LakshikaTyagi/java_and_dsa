package easy;

public class ProductOfDigits {

    static void main() {

        System.out.println(digits_product(1342));
        System.out.println(digits_product(1042));
        System.out.println(digits_product(11100));
        System.out.println(digits_product(1221));
    }

    static int digits_product(int n){
        if(n < 10)return n;
        return (n%10) * digits_product(n/10);
    }
}
