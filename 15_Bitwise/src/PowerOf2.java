public class PowerOf2 {
    static void main() {
        System.out.println(pow(4));
        System.out.println(pow(15));
        System.out.println(pow(0));
        System.out.println(pow(1));
        System.out.println(pow(-1));
        System.out.println(pow(-4));

    }

    static boolean pow(int n){
        if(n == 0)return false;
        return (n & (n-1)) == 0;
    }
}
