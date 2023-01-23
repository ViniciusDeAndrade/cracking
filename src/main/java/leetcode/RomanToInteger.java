package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        var roman = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        var chars = s.toCharArray();
        int result = 0;
        for (int index = 0; index < chars.length -1 ; index++) {
            var curr = roman.get(String.valueOf(chars[index]));
            var next = roman.get(String.valueOf(chars[index + 1]));

        }
        return result;
    }
}
