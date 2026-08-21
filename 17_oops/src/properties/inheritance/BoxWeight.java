package properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = 0;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, h, w);  //call the parent class constructor
//        used to initialise values present in parent class constructor
        this.weight = weight;
    }


}
