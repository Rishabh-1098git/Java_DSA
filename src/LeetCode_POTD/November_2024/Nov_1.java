package LeetCode_POTD.November_2024;

public class Nov_1 {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            int count = 0;
            int j = i;
            while(j<s.length() && s.charAt(i) == s.charAt(j)){
                j++;
                count++;
            }
            if(count < 3){
                sb.append(s.substring(i,j));
            }else{
                sb.append(s.substring(i,i+2));
            }

            i = j;
        }

        return sb.toString();

    }

}
