package Recursion.BackTracking;

import java.util.ArrayList;

public class No_of_Ways_in_a_MAZE {
    public static void main(String[] args) {
//        System.out.println(count(4,3));
//        paths("",3,3);
//        System.out.println(pathsRet("",3,3));
//        System.out.println(paths);
        System.out.println(pathsRetDiag("",3,3));
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    static ArrayList<String> paths = new ArrayList<>();
    static void paths(String p, int r, int c){
        if(r==1 && c==1){
            paths.add(p);
            return;
        }
        if(r>1){
            paths(p+'R',r-1,c);
        }
        if(c>1){
            paths(p+'D', r,c-1);
        }
    }

    static ArrayList<String> pathsRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathsRet(p+'R',r-1,c));
        }
        if(c>1){
            list.addAll(pathsRet(p+'D', r,c-1));
        }
        return list;
    }

    static ArrayList<String> pathsRetDiag(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathsRetDiag(p+'R',r-1,c));
        }
        if(r>1 && c>1){
            list.addAll(pathsRetDiag(p+'d',r-1,c-1));
        }
        if(c>1){
            list.addAll(pathsRetDiag(p+'D', r,c-1));
        }
        return list;
    }


}