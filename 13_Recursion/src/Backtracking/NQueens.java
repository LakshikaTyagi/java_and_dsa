package Backtracking;

public class NQueens {
    static void main() {

        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board,0));
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
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
//        check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
//        diagonal left
        int r = row , c = col;
        int maxLeft = Math.min(row,col);
        for (int i = 0; i < maxLeft; i++) {
            if(board[--r][--c]){
                return false;
            }
        }

//        diagonal right
        r = row ;
        c = col;
        int maxRight = Math.min(row,board[0].length - col - 1);
        for (int i = 0; i < maxRight; i++) {
            if(board[--r][++c]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for (boolean[] row : board){
            for(boolean element : row){
                if(element) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
