package Strings;

public class Stream {
    static void main() {

        String s = "abaccda";
        System.out.println(skip(s));
    }

    static String skip(String str){
        if (str.isEmpty()) return "";
        String ch = String.valueOf(str.charAt(0));
        if(ch.equals("a"))return skip(str.substring(1));
        return ch + skip(str.substring(1));
    }
}