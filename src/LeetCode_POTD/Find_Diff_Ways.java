package LeetCode_POTD;

import java.util.ArrayList;
import java.util.List;

public class Find_Diff_Ways {

        public static void main(String[] args) {

            String exp = "99";

            System.out.println(diffWaysToCompute(exp));
        }
        public static List<Integer> diffWaysToCompute(String exp) {

            List<Integer> list = new ArrayList<>();


            helper(exp, list, 0);


            return list;
        }

        static int helper(String exp, List<Integer>list, int level){
//        str.matches("\\d+")
            if(exp.matches("\\d+")){
                return Integer.parseInt(exp);
            }

            int val;

            for(int i=0; i<exp.length(); i++){
                if(exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/'){
                    char op = exp.charAt(i);

                    int a = helper(exp.substring(0,i), list, level+1);
                    int b = helper(exp.substring(i+1),list,  level+1);

                    if(op == '+'){
                        if(level == 0){
                            list.add(a+b);
                        }
                        else{
                            return a+b;
                        }
                    }else if(op == '-'){
                        if(level == 0){
                            list.add(a-b);
                        }
                        else{
                            return a-b;
                        }
                    }else if(op == '*'){
                        if(level == 0){
                            list.add(a*b);
                        }else{
                            return a*b;
                        }
                    }else{
                        if(level == 0){
                            list.add(a/b);
                        }
                        else{
                            return a/b;
                        }

                    }
                }

            }

            return 0;

        }
    }

