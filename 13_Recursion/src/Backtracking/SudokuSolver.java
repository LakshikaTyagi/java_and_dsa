package Backtracking;

import java.util.Arrays;

public class SudokuSolver {
    static void main() {

        int [][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board))
            display(board);
        else
            System.out.println("Cannot solve");
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1, col = -1;

        boolean emptyLeft = true;

//        this is how we are replacing r , c for arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
//            if you found some empty element in row, then break
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
//            Sudoku is solved
        }

//        backtrack
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)){
//                    found the answer
                    return true;
                }
                else{
//                    backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col , int num){
//        check the row
        for (int i = 0; i < 9; i++) {
            if(board[i][col] == num)return false;
        }
//        check the col
        for (int i = 0; i < 9; i++) {
            if(board[row][i] == num)return false;
        }
//        check the box
        int sr = row - row%3, sc = col - col%3;
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(board[i][j] == num)return false;
            }
        }
        return true;
    }

    static void display(int[][]board){
        for(int[] rows : board){
            for(int ele : rows){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
