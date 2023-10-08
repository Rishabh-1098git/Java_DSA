package Recursion._10_Days_Recursion_Challenge_;

public class _03_Family_Structure {
    public static void main(String[] args) {
        kthChild(3,4,1,1,true,child);
        System.out.println(child);
    }
    static String child ;
    static void kthChild(int n, int k, int gen, int count,boolean flag,String child){
            if(gen==n && count==k-2){
                if(flag){
                    child = "Male";
                }
                else{
                    child = "Female";
                }
                return;
            }
            if (gen==n && count!=k){
                return;
            }

            if (flag){
                kthChild(n,k,gen+1,count,true,child);
                kthChild(n,k,gen+1,count+1,false,child);
            }
            else {
                kthChild(n,k,gen+1,count,false,child);
                kthChild(n,k,gen+1,count+1,true,child);
            }

    }
}
