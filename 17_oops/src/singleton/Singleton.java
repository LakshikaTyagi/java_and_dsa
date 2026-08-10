package singleton;

public class Singleton {
    int num = 0;

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
//        check whether one object only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

}
