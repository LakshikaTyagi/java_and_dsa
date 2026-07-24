package Backtracking;

import java.util.ArrayList;

public class Maze {
    static void main() {

        System.out.println(count(3,3));

        path("",3,3);
        System.out.println();

        System.out.println(pathRet("",3,4));

        System.out.println(countDiagonal(3,3));
        System.out.println(pathRetDiagonal("",3,3));

        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
                {true,true,true},
        };
        pathRestrict("",maze,0,0);

    }

    static int count(int row , int col){
        if(row == 1 || col == 1)return 1;

        int c = 0;
        c += count(row-1,col);
        c += count(row, col-1);

        return c;
    }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.print(p + " ");
            return;
        }
        if(r > 1){
            path(p + "D", r-1,c);
        }
        if(c > 1){
            path(p + "R",r,c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        ArrayList <String> list = new ArrayList<>();
        if(r == 1 && c == 1){
            list.add(p);
            return list;
        }
        if(r > 1){
            list.addAll(pathRet(p + "D", r-1,c));
        }
        if(c > 1){
            list.addAll(pathRet(p + "R",r,c-1));
        }
        return list;
    }

    static int countDiagonal(int row , int col){
        if(row == 1 || col == 1)return 1;

        int c = 0;
        c += countDiagonal(row-1,col);
        c += countDiagonal(row, col-1);
        if(row > 1 && col > 1)c += countDiagonal(row-1,col-1);

        return c;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        ArrayList <String> list = new ArrayList<>();
        if(r == 1 && c == 1){
            list.add(p);
            return list;
        }
        if(r > 1){
            list.addAll(pathRetDiagonal(p + "V", r-1,c));  //V -> vertically
        }
        if(r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p+"D",r-1,c-1));  //D -> diagonally
        }
        if(c > 1){
            list.addAll(pathRetDiagonal(p + "H",r,c-1));  //H -> horizontally
        }
        return list;
    }

    static void pathRestrict(String p,boolean[][] maze, int r, int c){
        if(r == maze.length -1  && c == maze[0].length -1 ){
            System.out.print(p + " ");
            return;
        }
        if(!maze[r][c]){
            return ;
        }
        if(r < maze.length - 1){
            pathRestrict(p + "D",maze, r+1,c);
        }
        if(c < maze[0].length - 1){
            pathRestrict(p + "R",maze,r,c+1);
        }
    }

}
