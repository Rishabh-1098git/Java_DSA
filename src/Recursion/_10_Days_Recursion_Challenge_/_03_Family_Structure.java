package Recursion._10_Days_Recursion_Challenge_;

public class _03_Family_Structure {
    public static void main(String[] args) {
        System.out.println(kthChildNthGeneration(3,4));
    }
    public static String kthChildNthGeneration(int n, long k) {
        if(n==1 || k==1){
            return "Male";
        }

        long par = (k+1)/2;

        String parGender = kthChildNthGeneration(n-1, par);

        if(2*par-k == 1){
            return parGender;
        }
        else{
            if(parGender.equals("Male")){
                return "Female";
            }
            else{
                return "Male";
            }
        }
    }
}
