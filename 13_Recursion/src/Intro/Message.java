package Intro;

public class Message {
    static void main() {

//        write a message that prints hello world
        message(5);

    }

    static void message(int n) {
        if(n == 0)return;
        System.out.println("Hello World !");
        message(n -1);
    }
}