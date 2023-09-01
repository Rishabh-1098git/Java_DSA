package Arrays.Arrays_Basic;

public class Pr_07_House_Robbers {
    public static void main(String[] args) {
       // Dynamic Programming ka concept lagega

        // nums = [2,7,9,3,1] --> output:12
        int[] nums = {2,1,1,2};
         int money1=0;
         int count1=0;

         int money2=0;
         int count2=1;

        for (int i = 0; i < nums.length ; i++) {
            if(count1>= nums.length){
                break;
            }
            money1+=nums[count1];
            count1+=2;
        }
        System.out.println(money1);

        for (int i = 1; i < nums.length ; i++) {
            if(count2>= nums.length){
                break;
            }
            money2+=nums[count2];
            count2+=2;
        }
        System.out.println(money2);
        int a = Math.max(money1,money2);
        System.out.println(a);

    }
}
