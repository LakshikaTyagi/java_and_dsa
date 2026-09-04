package access;

import java.lang.String;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass obj = new SubClass(2, "Lakshika ");
        System.out.println(obj.arr);

        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof A);
//        System.out.println(obj instanceof String);   it only checks for class/interface type that is compatible through inheritance

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getClass());

    }
}
