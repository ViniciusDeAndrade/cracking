package leetcode;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    } //1994

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
            int curr = roman.get(String.valueOf(chars[index]));
            int next = roman.get(String.valueOf(chars[index + 1]));
            if(curr > next) {
                result += curr;
            } else {
                result += next - curr;
                index++;
            }

//            result += calculate(curr, chars, index, roman);


        }
        return result;
    }

    private static int calculate(int curr, char[] chars, int index, Map<String, Integer> roman) {
        char currentChar = chars[curr];
        int sub = 0;
        for (int i = curr ; i < chars.length; i ++) {
            sub += roman.get(String.valueOf(chars[i]));
            index++;
            if (currentChar != chars[i]) {
                return  currentChar - sub;
            }
        }
        return 0;
    }
}
