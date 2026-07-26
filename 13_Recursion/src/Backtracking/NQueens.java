package Backtracking;

public class NQueens {
    static void main() {

    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }

        int count = 0;

//        placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
//            place the queen if it is safe
            if(isSafe(board,row,col)){

            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
    }

    static void display(boolean[][] board){
        for (boolean[] row : board){
            for(boolean element : row){
                if(element) System.out.println("Q ");
                else System.out.println("X ");
            }
            System.out.println();
        }
    }
}
