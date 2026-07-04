public class RightMostBit {
    static void main() {

        System.out.println(position(10));
        System.out.println(position(288));
        System.out.println(position(529));
        System.out.println(position(512));

        System.out.println(rightMostBit(10));
        System.out.println(rightMostBit(288));
        System.out.println(rightMostBit(259));
        System.out.println(rightMostBit(512));
    }

    static  double log2(int x){
        return Math.log(x)/Math.log(2.0);
    }


    static int position(int n){
        int l = (int)log2(n) + 1;
        for (int i = 1; i <= l ; i++) {
            if((n & 1) == 1)return i;
            n = n >> 1;
        }
        return -1;
    }

    static int rightMostBit(int n){
        return n & (-n);
    }
}
