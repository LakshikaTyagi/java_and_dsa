package Strings;

import java.util.ArrayList;

public class PhonePad {
    static void main() {

        System.out.println(phonePad("","23"));
        System.out.println(phonePad("","79"));

        System.out.println(padCount("","24"));

    }

    static ArrayList<String> phonePad(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';  //this will convert '2' into 2
        char ch = (char)(95+2*(digit-2) + digit - 1);
        if(digit == 8 || digit == 9)ch += 1;

        int n = 3;
        if(digit == 7 || digit == 9)n = 4;

        for (int i = 0; i < n; i++) {
            ch = (char) (ch + 1);
            list.addAll(phonePad(p + ch, up.substring(1)));
        }

        return list;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int c = 0;

        int digit = up.charAt(0) - '0';  //this will convert '2' into 2
        char ch = (char)(95+2*(digit-2) + digit - 1);
        if(digit == 8 || digit == 9)ch += 1;

        int n = 3;
        if(digit == 7 || digit == 9)n = 4;

        for (int i = 0; i < n; i++) {
            ch = (char) (ch + 1);
            c += padCount(p + ch, up.substring(1));
        }

        return c;
    }
}
