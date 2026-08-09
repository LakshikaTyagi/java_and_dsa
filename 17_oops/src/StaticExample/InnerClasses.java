package StaticExample;

class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}

public class InnerClasses {
//    static class Test {
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }

    static void main() {

        Test a = new Test("Ram");
        Test b = new Test("Ramesh");


        System.out.println(a.name);
    }
}

//static class A {
//    ...
//}
