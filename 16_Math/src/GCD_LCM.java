public class GCD_LCM {
    static void main() {
        System.out.println(gcd(484,781));
        System.out.println(gcd(0,224));

        System.out.println(lcm(12,46));
        System.out.println(lcm(1,999));
    }

//    Euclidean algorithm
    static int gcd(int a, int b){
//        if(a == 0)return b;
//        return gcd(b%a,a);

//        OR (both are correct)

        if(b == 0)return a;
        return gcd(b,a%b);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
