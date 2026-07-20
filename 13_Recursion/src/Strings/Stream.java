package Strings;

public class Stream {
    static void main() {

        String s = "abaccda";
        System.out.println(skip_a(s));

        System.out.println(skip_apple("redapplewhite"));
        System.out.println(skipAppNotApple("redappleappblack"));
    }

//    skip all a's from string
    static String skip_a(String str){
        if (str.isEmpty()) return "";
        String ch = String.valueOf(str.charAt(0));
        if(ch.equals("a"))return skip_a(str.substring(1));
        return ch + skip_a(str.substring(1));
    }

//    skip apple from string
    static String skip_apple(String str){
        if(str.length() < 5) return str;

//        if(str.startsWith("apple"))return str.substring(5);  //this is more efficient
        String s = str.substring(0,5);
        if(s.equals("apple"))return skip_apple(str.substring(5));

        return str.charAt(0) + skip_apple(str.substring(1));
    }

//    skip app if there is apple
    static String skipAppNotApple(String str){
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        }

        return str.charAt(0) + skipAppNotApple(str.substring(1));
    }
}