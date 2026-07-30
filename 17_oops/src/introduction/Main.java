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


        Student lakshika;           //declare reference to object , object not initialized yet
        lakshika = new Student();   //allocate a Student object

        System.out.println(lakshika);
        System.out.println(lakshika.rno + " " + lakshika.name + " " + lakshika.marks);
        lakshika.greeting();

        Student s1 = new Student();   //declare and initialized an object
        s1.rno = 45;
        s1.name = "john";
        s1.marks = 89.43F;
        System.out.println(s1.rno + " " + s1.name + " " + s1.marks);

        Student s2 = new Student(19, "Ramesh sharma", 73.89F);
        System.out.println(s2.rno + " " + s2.name + " " + s2.marks);

        Student random = new Student(s1);
        System.out.println(random.rno + " " + random.name + " " + random.marks);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "something else";
        System.out.println(two.name);

    }
}

//    create a class
//    for every single student
class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello ! My name is " + this.name);
    }

    //    we need a way to add the values of above properties object by object
//    we need one word to access to every object

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

//    Student() {
//        this.rno = 12;
//        this.name = "Lakshika Tyagi";
//        this.marks = 9.41F;
//    }

    //    this a method to call a constructor from another constructor
    Student() {
        this(13, "default person", 100.0F);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}