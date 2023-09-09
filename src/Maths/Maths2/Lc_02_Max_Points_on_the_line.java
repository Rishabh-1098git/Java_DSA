package Maths.Maths2;

public class Lc_02_Max_Points_on_the_line {
    public static void main(String[] args) {
        int [][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int maxi = 2;
        for (int i = 0; i < points.length-1 ; i++) {
            int count=2;
            for (int j = 0; j < points.length ; j++) {
                    if(sameLine(points[i],points[i+1],points[j]) && j!=i &&j!=i+1){
                        count++;
                        maxi = Math.max(maxi, count);
                    }
            }
        }
        System.out.println(maxi);
    }

    static boolean sameLine(int[] point, int[] point1, int[] point2) {
        int m = (point1[1]-point[1])/(point1[1]-point[1]);
        if(point2[1]-point[1] == m*(point2[0]-point[0])){
            return true;
        }
        else {
            return false;
        }
    }
}
