package StaticExample;

public class Main {
    static void main() {
//        static variables can be accessed without creating object of that class
        System.out.println(Human.population);

        Human h = new Human(23, "xyz", 38922, false);
        System.out.println(Human.population);

        Human h1 = new Human(29, "abc", 87312, true);

        System.out.println(h.name);

//        it is generally a good practice to access static variables through class names not object names
        System.out.println(Human.population);

        System.out.println(h1.population);

    }
}
