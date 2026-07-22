package Strings;

import java.util.ArrayList;

public class Permutations {
    static void main() {

        permutation("","abc");
        System.out.println();

        System.out.println(permutationRet("","abc"));
        System.out.println(permutationCount("","abc"));
    }

    static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            char ch = up.charAt(0);
            permutation(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permutationRet(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            char ch = up.charAt(0);
//            ArrayList<String> ans = permutationRet(f+ch+s, up.substring(1));
//            list.addAll(ans);
            list.addAll(permutationRet(f+ch+s,up.substring(1)));
        }

        return list;
    }

    static int permutationCount(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            char ch = up.charAt(0);
            count += permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
