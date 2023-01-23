import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Luxoft {
//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//            INVALID: (() INVALID: {}((})
//


    public static void main(String[] args) {
        System.out.println(solution("{[]}")); //true
        System.out.println(solution("{[}}")); //false
        System.out.println(solution("{{")); //false
        System.out.println(solution("({)}")); //false
    }


    public static boolean solution(String input) {
        int len = input.length();
        if (len % 2 == 1) return false;

        Map<String, Integer> memo = new HashMap<>();

        for (int s = 0; s < len; s++) {
            String ch = String.valueOf(input.charAt(s));

            if(ch.equals("(") || ch.equals("{") || ch.equals("[")) {
                memo.put(ch, memo.getOrDefault(ch, 0) + 1);
            } else {
                if(ch.equals("]")) {
                    if(!memo.containsKey("[")) return false;
                    memo.remove("[");
                }
                if(ch.equals("}")) {
                    if(!memo.containsKey("{")) return false;
                    memo.remove("{");
                }
                if(ch.equals(")")) {
                    if(!memo.containsKey("(")) return false;
                    memo.remove("(");
                }
            }
        }

        return memo.values().isEmpty();
    }
}
