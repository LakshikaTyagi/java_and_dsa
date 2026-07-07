package easy;

public class Nto1 {
    static void main() {

        print_num_desc(5);

        print_num_asc(5);
        System.out.println();

        print_num_both(5);
        System.out.println();
        
    }

    static void print_num_desc(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
//        print_num_desc(n--); //infinite loop
        print_num_desc(--n);  // == print_num_desc(n-1)
    }

    static void print_num_asc(int n){
        if(n == 0) {
            return;
        }
        print_num_asc(n-1);
        System.out.print(n + " ");
    }

    static void print_num_both(int n){
        if(n == 0){
            System.out.print(" - rev - ");
            return;
        }
        System.out.print(n + " ");
        print_num_both(n-1);
        System.out.print(n + " ");
    }

}
