package access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public ObjectDemo() {
        super();
    }


    static void main() {
        ObjectDemo obj1 = new ObjectDemo(34, 89.54f);
        ObjectDemo obj2 = new ObjectDemo(34, 89.54f);
        ObjectDemo obj3 = obj1;

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2 , ==");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2 , .equals");
        }

        System.out.println(obj1.getClass());

    }
}
