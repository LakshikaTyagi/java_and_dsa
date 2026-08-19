package properties.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //    cube
    Box(double side) {
        this.w = side;
        this.h = side;
        this.l = side;
    }

//    13.40
}
