package singleton;

import access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass obj = new SubClass(2, "Lakshika ");
        System.out.println(obj.m);   //can access protected variable in different package but a subclass
    }
}
