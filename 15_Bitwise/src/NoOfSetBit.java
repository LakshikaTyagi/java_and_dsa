public class NoOfSetBit {
    static void main() {

        System.out.println(setBit(10));
        System.out.println(setBit(27));
        System.out.println(setBit(3981));

        System.out.println(setBit2(8));
        System.out.println(setBit2(27));
        System.out.println(setBit2(3981));

    }

    static int setBit(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) == 1)c++;
            n = n >> 1;
        }
        return c;
    }

    static int setBit2(int n){
        int c = 0;
        while(n > 0){
            c++;
            n = n & (n-1);
        }
        return c;
    }
}
