package ScholarTest;
import java.util.*;

public class MainTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int [] arr = {3,6,2,7,5};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(7);
        list.add(5);
        int result = poisonousPlants(list);
        System.out.println(result);

    }
    public static int poisonousPlants(List<Integer> p) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int t = 100;
        int ans = -1;

        while(t != 0){

            boolean isPoisonus = false;

            for(int i = p.size()-1; i>0; i--){
                if(p.get(i) > p.get(i-1)){
                    list.add(i);
                    isPoisonus = true;
                    ans = count;
                }
            }
            if(!isPoisonus){
//                ans = count;
                break;
            }
            count++;

            for (int i = 0; i < list.size(); i++) {
                p.remove(list.get(i));
            }

//            System.out.println(list);
            t--;

        }

        return ans;
    }
}
