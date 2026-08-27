package properties.inheritance;

public class Main {
    static void main() {
        Box box = new Box(4, 4, 7.23);
//        Box box1 = new Box(box);
        Box.greeting();

        System.out.println(box.getL());
//        System.out.println(box.w + " " + box.h);

//        BoxWeight box3 = new BoxWeight();
        BoxWeight.greeting();
        BoxWeight box4 = new BoxWeight(12, 34, 53, 43);
        System.out.println(box4.w + " " + box4.weight);

        Box box5 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box5.weight);
//        box5.greeting();

//        there are many variables in both parent and child classes
//        you're given access to variables that are in the ref_type i.e. BoxWeight
//        hence u should have access to weight variable
//        this also means that the ones you are trying to access should be initialized
//        but here when the object itself is of type parent class , how will you call the constructor of child class
//        this is why here is an error

//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6.w);

        BoxWeight box6 = new BoxWeight(box4);
        System.out.println(box6.w);

        BoxPrice box7 = new BoxPrice(5, 8, 200);

        BoxColor box8 = new BoxColor();
        System.out.println(box8.color);

    }
}
