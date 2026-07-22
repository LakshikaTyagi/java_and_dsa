package Strings;

import java.util.ArrayList;

public class Dice {
    static void main() {

        System.out.println(diceRoll("",4));
        System.out.println(diceRoll("",2));


        System.out.println(diceRollFace("",4,3));
    }

    static ArrayList<String> diceRoll(String p, int target){
        ArrayList<String> list = new ArrayList<>();
        if(target == 0){
            list.add(p);
            return list;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            list.addAll(diceRoll(p+i,target-i));
        }

        return list;
    }

    static ArrayList<String> diceRollFace(String p, int target, int face){
        ArrayList<String> list = new ArrayList<>();
        if(target == 0){
            list.add(p);
            return list;
        }

        for(int i = 1; i <= face && i <= target; i++){
            list.addAll(diceRollFace(p+i,target-i,face));
        }

        return list;
    }

}
