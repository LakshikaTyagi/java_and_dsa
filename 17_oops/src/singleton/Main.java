package singleton;

import access.A;

public class Main {
    static void main() {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

//        all 3 ref variable pointing to just one object
    }
}
