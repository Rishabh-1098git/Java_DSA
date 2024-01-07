import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Rough1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i =0; i<T ; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt(); // large ornaments
            int Y = sc.nextInt(); // small ornaments

            int yy = Y/3;


            if((N-yy) < 0){
                Y = Y-(N*3);
                X = X-(N*2)-yy;
                if(X<0){
                    System.out.println("No");
                }
                else {
                    System.out.println("Yes");
                }
            }
            else{
                N = N-yy;
                X = X - (N*2)-yy;

                if(X < 0){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }

        }

    }


}

