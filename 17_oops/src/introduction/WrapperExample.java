package introduction;

public class WrapperExample {
    static void main() {
        int a = 10, b = 20;

        Integer num = 45, num1 = 89;  //wrapper class of int
        num = 78;

        swap(a, b); //does not swap at all since int is primitive data type
        swap(num, num1);

        System.out.println(a + " " + b);
        System.out.println(num + " " + num1);

        final int bonus = 2;

        final A kunal = new A("Kunal kushwaha");
        kunal.name = "other name";
//        kunal = new A("new object"); //when a non primitive is final , you cannot to resign it

        A obj;
        for (int i = 0; i < 35000; i++) {
            obj = new A("Random name");
        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destoryed.");
    }
}