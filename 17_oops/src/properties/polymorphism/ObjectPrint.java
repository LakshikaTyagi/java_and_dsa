package properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    //even after clicking on println , you will not get this method , because this overriding happens at runtime
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    static void main() {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
