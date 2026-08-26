package properties.polymorphism;

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void main() {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(1, 4, 6));
    }


}
