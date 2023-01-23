package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class isIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 1) return true;
        Map<Character, Character> map = new HashMap<>();

        for(int index = 0; index < s.length(); index++) {
            if(map.containsKey(s.charAt(index))) {
                char c = map.get(s.charAt(index));
                if(c != t.charAt(index)) return false;
            } else {
                map.put(s.charAt(index), t.charAt(index));
            }
        }

        return map.values().stream().distinct().count() == map.keySet().stream().distinct().count();
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        isIsomorphic isIsomorphic = new isIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic("egg","add"));
//        System.out.println(isIsomorphic.isIsomorphic(s,t));
    }
}
