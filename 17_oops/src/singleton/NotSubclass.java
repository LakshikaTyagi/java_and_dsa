package singleton;

import access.A;

public class NotSubclass {

    static void main() {
        A obj = new A();
        int n = obj.m;  //cannot access protected variable in different package and not a subclass
    }
}
