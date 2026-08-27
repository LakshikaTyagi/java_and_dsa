package properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }


    static void greeting() {
        System.out.println("Hey! I am in boxweight class.");
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
//        if super is not called then default one will be called , make sure to write the default one
        super(l, h, w);  //call the parent class constructor
//        used to initialise values present in parent class constructor
//        super.weight = l;
        this.weight = weight;
        this.h = h; //same as super.h = h
//        System.out.println(this.weight + " " + super.weight);
    }


    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
