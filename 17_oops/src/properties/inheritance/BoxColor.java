package properties.inheritance;

public class BoxColor extends BoxWeight {
    String color;

    public BoxColor() {
        this.color = null;
    }

    public BoxColor(double side, double cost, String color) {
        super(side, cost);
        this.color = color;
    }

}
