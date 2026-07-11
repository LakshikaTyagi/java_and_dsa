package Pattern;

public class BubbleSort {
    static void main() {
    }

    static void bubbleSort(int r, int c) {
        if(r == 0)return;
        if(c < r){
            bubbleSort(r,c+1);
            System.out.print("* ");
        }
        else{
            bubbleSort(r-1,0);
            System.out.println();
        }
    }
}