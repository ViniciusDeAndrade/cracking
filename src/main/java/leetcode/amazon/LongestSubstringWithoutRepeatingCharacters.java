package leetcode.amazon;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {

        var set = new HashSet<Character>();
        var chars = s.toCharArray();
        var test = s.chars().distinct().count();
        if(test == s.length()) return s.length();


        var len = chars.length;

        int pointer = 0;
        int max = 0;

        int index = pointer;
        while (pointer < len) {

            if (set.contains(chars[index])) {
                max = Math.max(max, set.size());
                pointer++;
                index = pointer;
                set.clear();
            } else {
                set.add(chars[index]);
                index++;
            }
            if(index >= len) break;
        }

        return max;
    }
}
