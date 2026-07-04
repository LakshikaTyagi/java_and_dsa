public class XOR {
    static void main() {

        System.out.println(xor(8));
        System.out.println(xor(1));
        System.out.println(xor(111));

        System.out.println(xor_range(3,9));
        System.out.println(xor_range(34,35));
        System.out.println(xor_range(3,31));

    }

//    xor of numbers from 0 to n
    static int xor(int n){
        return switch (n % 4) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            case 3 -> 0;
            default -> -1;
        };
    }

//    xor of numbers in range
    static int xor_range(int a, int b){
        if(a == b)return 0;
        return xor(b)^xor(a-1);
    }
}
