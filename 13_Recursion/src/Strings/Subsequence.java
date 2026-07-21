package Strings;

import java.util.ArrayList;

public class Subsequence {
    static void main() {

        subseq("","abc");
        System.out.println();

        ArrayList <String> list = new ArrayList<>();
        list = subseqReturn("","abc");
        System.out.println(list);
    }

    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch , up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqReturn(String p, String up){
        ArrayList <String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p + ch , up.substring(1));
        ArrayList <String> right = subseqReturn(p, up.substring(1));

        list.addAll(left);
        list.addAll(right);

        return list;
    }

}
