package Strings;

public class _05_Performance {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i <26 ; i++) {
//            char ch = (char)('a'+i);
//            str+=ch;
//        }
//        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.reverse());
    }
}
