package StaticExample;

public class Main {
    static void main() {
//        static variables can be accessed without creating object of that class
        System.out.println(Human.population);

        Human h = new Human(23, "xyz", 38922, false);
        System.out.println(Human.population);

        Human h1 = new Human(29, "abc", 87312, true);

//        it is generally a good practice to access static variables through class names not object names
        System.out.println(Human.population);
        System.out.println(h1.population);

//        Main funn = new Main();
//        funn.fun2();

    }

    //    this is not dependent on objects
    static void fun() {
//        greeting(); //you cannot use this because it requires an instance
//        but the function you are using it in does not depend on instances

//        you cannot access non - static stuff without referencing their instances in static context
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    public void greeting() {
        fun();
        System.out.println("Hello world !");
    }
}
