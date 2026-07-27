package Backtracking;

import static Backtracking.NQueens.display;

public class NKnights {
    static void main() {

    }

    static void knight(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            display(board);
        }
    }

}
