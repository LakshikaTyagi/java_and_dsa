package singleton;

import access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        A obj = new A(2, "Lakshika ");
//        System.out.println(obj.m);   //can access protected variable in different package but only by subclass not parent class
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubSubClass obj = new SubSubClass(2, "Lakshika ");
        System.out.println(obj.m);   //can access protected variable in different package but only by subclass not parent class
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass2 obj = new SubClass2(2, "Lakshika ");
        System.out.println(obj.m);   //can access protected variable in different package but a subclass
        obj.m = 9;
    }
}