public class NewtonRaphson {
    static void main() {

        System.out.printf("%.5f\n",sqrt(4));
        System.out.printf("%.5f\n",sqrt(40));
        System.out.printf("%.5f\n",sqrt(400));

    }

    static double sqrt(int n){
        double x = n-1;
        double root = 1;
        double error = Math.abs(root - x);
//        error = error < 0 ? -1*error : error;
        while(error > 0.5){
            root = (x + (n/x))/2;
            error = root - x;
            error = error < 0 ? -1*error : error;
            x = root;
//            x = 9;
        }
        return root;
    }
}
