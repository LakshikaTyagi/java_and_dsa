public class MagicNumber {
    static void main() {

        System.out.println(magic(2));
        System.out.println(magic(5));
        System.out.println(magic(6));
        System.out.println(magic(10));
        System.out.println(magic(20));
        System.out.println(magic(50));

    }

    static int magic(int n){
        int sum = 0;
        int i = 1;
        while(n > 0){
            sum += (n&1)* Math.powExact(5,i);
            n = n >> 1;
            i++;
        }
        return sum;
    }
}
