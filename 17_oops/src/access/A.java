package access;

public class A {
    int num;
    public String name;
    protected int[] arr;
    protected int m = 7;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
