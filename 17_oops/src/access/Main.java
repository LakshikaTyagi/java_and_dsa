package access;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main() {
        A obj = new A(10, "heyyy");
//        need to do few things
//        1.  access the data members
//        2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;   //since DEFAULT_CAPACITY is private int , we cannot access it in another file

        int n = obj.getNum();

        obj.num = 3;
        int m = obj.num; //default access modifier is accessed here , but cannot be accessed from outside package
        System.out.println(Arrays.toString(obj.arr));

    }
}
