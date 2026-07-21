package Strings;

import java.util.ArrayList;

public class Ascii {
    static void main() {

        System.out.println(ascii("", "ab"));
    }

    static ArrayList<String> ascii(String p, String up){
        ArrayList <String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList <String> first = ascii(p + ch, up.substring(1));
        ArrayList <String> second = ascii(p + (ch + 0), up.substring(1));
        ArrayList <String> third = ascii(p, up.substring(1));

        list.addAll(first);
        list.addAll(second);
        list.addAll(third);

        return list;


    }
}
