package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age);  //cannot reference it
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1;  //same output while using Human
        Human.population += 1;

        Human.message();

    }


}
