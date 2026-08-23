package properties.inheritance;

public class Box {
    private double l;  //can be used only in this file
    double w;
    double h;
    double weight;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //    cube
    Box(double side) {
//        super();  object class
        this.w = this.l = this.h = side;
    }

    Box(double l, double h, double w) {
        System.out.println("box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void Information() {
        System.out.println("running the box");
    }

}