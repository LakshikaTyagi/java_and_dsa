package StaticExample;

public class Main {
    static void main() {
        Human h = new Human(23, "xyz", 38922, false);
        System.out.println(h.population);

        Human h1 = new Human(29, "abc", 87312, true);

        System.out.println(h.name);
        System.out.println(h.population);
        //27
    }
}
