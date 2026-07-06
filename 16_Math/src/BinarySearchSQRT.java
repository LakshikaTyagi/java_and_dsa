public class BinarySearchSQRT {
    static void main() {

        System.out.println(binarySearchSQRT(4));
        System.out.println(binarySearchSQRT(99));
        System.out.println(binarySearchSQRT(700));

        System.out.println(sqrt(4,2));
        System.out.println(sqrt(99,6));
        System.out.println(sqrt(700,5));
    }

    static float binarySearchSQRT(int n){
        float low = 0;
        float high = n;
        float mid = 1;
        while(low < high){
            mid = low + (high - low)/2;
            if(mid*mid == n)return mid;
            else if(mid * mid > n)high = mid-1;
            else low = mid;
        }

//        for first decimal place
        int i = 0;
        for (i = 1; i < 10; i++) {
            float temp = (float) (low + i*0.1);
            if(temp*temp > n){
                i = i -1;
                break;
            }
        }
        if(i == 10)i = 9;
        low = (float) (low + i*0.1);

//        for second decimal place
        for (i = 1; i < 10; i++) {
            float temp = (float)(low +  i*0.01);
            if(temp*temp > n){
                i = i-1;
                break;
            }
        }
        if(i == 10)i = 9;
        low = (float) (low + i*0.01);
        return low;
    }

//    time complexity : O(n)
//    this one is more optimized and precised
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
