package Backtracking;

import java.util.Arrays;

public class AllPaths {
    static void main() {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true,true,true}
        };

//        allPathOverflow("",maze,0,0);  //StackOverflowError
        allPaths("",maze,0,0);
        System.out.printf("\n\n");

        int[][] arr = new int[3][3];
        allPathPrint("",arr,1,maze,0,0);

        
    }

    static void allPathOverflow(String p, boolean[][] maze, int r, int c){
        if(r == maze.length -1  && c == maze[0].length -1 ){
            System.out.print(p + " ");
            return;
        }
        if(!maze[r][c]){
            return ;
        }
        if(r > 0){
            allPathOverflow(p + "U",maze,r-1,c);
        }
        if(c > 0){
            allPathOverflow(p + "L",maze,r,c-1);
        }
        if(r < maze.length - 1){
            allPathOverflow(p + "D",maze, r+1,c);
        }
        if(c < maze[0].length - 1){
            allPathOverflow(p + "R",maze,r,c+1);
        }
    }


    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length -1  && c == maze[0].length -1 ){
            System.out.print(p + " ");
            return;
        }
        if(!maze[r][c]){
            return ;
        }

//        I am considering it false for this call so that it will not be visited again
        maze[r][c] = false;

        if(r < maze.length - 1){
            allPaths(p + "D",maze, r+1,c);
        }
        if(c < maze[0].length - 1){
            allPaths(p + "R",maze,r,c+1);
        }
        if(r > 0){
            allPaths(p + "U",maze,r-1,c);
        }
        if(c > 0){
            allPaths(p + "L",maze,r,c-1);
        }

//        this line is where the function will be over
//        so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathPrint(String p, int[][] arr, int level, boolean[][] maze, int r, int c){
        if(r == maze.length -1  && c == maze[0].length -1 ){
            arr[r][c] = level;
            System.out.println(Arrays.deepToString(arr));
            System.out.println(p);
            arr[r][c] = 0;
            return;
        }
        if(!maze[r][c]){
            return ;
        }

//        I am considering it false for this call so that it will not be visited again
        maze[r][c] = false;
        arr[r][c] = level;

        if(r < maze.length - 1){
            allPathPrint(p + "D",arr,level+1,maze, r+1,c);
        }
        if(c < maze[0].length - 1){
            allPathPrint(p + "R",arr,level+1,maze,r,c+1);
        }
        if(r > 0){
            allPathPrint(p + "U",arr,level+1,maze,r-1,c);
        }
        if(c > 0){
            allPathPrint(p + "L",arr,level+1,maze,r,c-1);
        }

//        this line is where the function will be over
//        so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        arr[r][c] = 0;
    }


}
