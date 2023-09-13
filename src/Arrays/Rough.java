package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            int x = t/4;
            System.out.println(t/2 +" "+ x +" "+ x);
        }

    }
}
