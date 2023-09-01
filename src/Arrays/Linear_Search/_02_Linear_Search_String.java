package Arrays.Linear_Search;

public class _02_Linear_Search_String {
    public static void main(String[] args) {
        String name = "RISHABH_SAINT";
        char target = 'I';
        System.out.println(search(name,target));
        System.out.println(search1(name,target));
    }

    static boolean search(String name, char target) {
        for(int i=0; i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    // using for each loop
    static boolean search1(String name,char target){
        for(char ch : name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
