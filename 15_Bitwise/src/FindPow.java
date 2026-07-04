public class FindPow {
    static void main() {

        System.out.println(pow(3,6));
        System.out.println(pow(12,3));

    }

    static int pow(int base , int exp){
        int res = 1;
        while(exp > 0){
            if((exp & 1) == 1)res = res * base;
            base = base * base;
            exp = exp>> 1;
        }
        return res;
    }
}
