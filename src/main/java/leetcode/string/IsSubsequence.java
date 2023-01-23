package leetcode.string;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        for(int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            if (!t.contains(String.valueOf(charS))) return false;

            for(int j = 0; j < t.length() ; j++) {
                char charT = t.charAt(j);
                if(charS == charT && j < i) return false;

            }
        }

        return true;
    }

    public String test() {
        return new BigInteger("110", 2).add(new BigInteger("101", 2)).toString();
    }

    public void tes(){
        IntStream.of(1,2).sum();
    }
}
