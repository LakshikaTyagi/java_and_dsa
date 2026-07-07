import static java.lang.Double.NaN;

public class NewtonRaphson {
    static void main() {

        System.out.printf("%.5f\n",sqrt(0));
        System.out.printf("%.5f\n",sqrt(40));
        System.out.printf("%.5f\n",sqrt(400));

    }

    static double sqrt(int n){
        if(n < 1)return NaN;
        double x = n-1;
        double root = 1;
        double error = Math.abs(root - x);
//        error = error < 0 ? -1*error : error;
        while(error > 0.5){
            root = (x + (n/x))/2;
            error = root - x;
            error = error < 0 ? -1*error : error;
            x = root;
        }
        return root;
    }
}
