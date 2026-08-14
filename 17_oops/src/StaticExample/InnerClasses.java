package StaticExample;

class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }

    @Override
    public String toString() {
//      return "Test{" + "name='" + name + '\'' + '}';
        return name;
    }
}

public class InnerClasses {
//    static class Test {         //this should be static as it is inner class, inner classes cannot be non - static
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }

    static void main() {

        Test a = new Test("Ram");
        Test b = new Test("Ramesh");

        System.out.println(a);

        System.out.println(a.name);
    }
}

//static class A {  //error outer classes should be non - static
//    ...
//}
