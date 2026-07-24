package Backtracking;

public class AllPaths {
    static void main() {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true,true,true}
        };

//        allPathOverflow("",maze,0,0);  //StackOverflowError 1.07
        allPaths("",maze,0,0);

        
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
        if(r > 0){
            maze[r][c] = false;
            allPaths(p + "U",maze,r-1,c);
            maze[r][c] = true;
        }
        if(c > 0){
            maze[r][c] = false;
            allPaths(p + "L",maze,r,c-1);
            maze[r][c] = true;
        }
        if(r < maze.length - 1){
            maze[r][c] = false;
            allPaths(p + "D",maze, r+1,c);
            maze[r][c] = true;
        }
        if(c < maze[0].length - 1){
            maze[r][c] = false;
            allPaths(p + "R",maze,r,c+1);
            maze[r][c] = true;
        }
    }

}
