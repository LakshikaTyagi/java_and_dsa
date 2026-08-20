package properties.inheritance;

public class Main {
    static void main() {
        Box box = new Box(4, 4, 7.23);
        Box box1 = new Box(box);
        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l + " " + box3.weight);

    }
}
