package easy;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class CountSteps {
    static void main() {

        System.out.println(numberOfSteps(23));
        System.out.println(numberOfSteps(2309));
    }

    static int numberOfSteps(int num) {
        return helper(num,0);
    }

    static int helper(int num, int count){
        if(num == 0)return count;
        if((num&1) == 1)return helper(num-1,count+1);
        else return helper(num/2,count+1);
    }
}
