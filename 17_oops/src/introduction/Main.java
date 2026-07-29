package introduction;

import java.util.Arrays;

public class Main {
    static void main() {

//        store 5 roll numbers
        int[] numbers = new int[5];

//        store 5 names
        String[] names = new String[5];

//        data of 5 students : {roll no. name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));


        Student lakshika;
        lakshika = new Student();

        System.out.println(lakshika);
        System.out.println(lakshika.rno + " " + lakshika.name + " " + lakshika.marks);

        Student s1 = new Student();
        s1.rno = 45;
        s1.name = "john";
        s1.marks = 89.43F;
        System.out.println(s1.rno + " " + s1.name + " " + s1.marks);

    }
}

//    create a class
//
class Student {
    int rno;
    String name;
    float marks;
}