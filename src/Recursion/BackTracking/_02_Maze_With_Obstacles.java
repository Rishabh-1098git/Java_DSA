package Recursion.BackTracking;

import java.util.ArrayList;

public class _02_Maze_With_Obstacles {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true,false,true},
                            {true,true,true}};
        System.out.println(pathsRet("",0,0,maze));
    }

    static ArrayList<String> pathsRet(String p, int r ,int c,boolean[][] maze){
        if(r== maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if(r < maze.length-1){
            list.addAll(pathsRet(p+'R',r+1,c,maze));
        }
        if(c < maze[0].length-1){
            list.addAll(pathsRet(p+'D',r,c+1,maze));
        }
        return list;
    }

}
