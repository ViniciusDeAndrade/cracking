package leetcode.string;

public class StringToInteger {

    public static int myAtoi(String s) {
        System.out.println("menor " + Integer.MIN_VALUE);
        s = s.trim();
        if(s.isBlank() || Character.isLetter(s.charAt(0))) return 0;


        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < s.length(); index++)
            if(Character.isDigit(s.charAt(index)))
                sb.append(s.charAt(index));

        long result = Long.parseLong(sb.toString());
        result = (int) result;

        if(result >= Integer.MIN_VALUE) return 0;


        if(s.contains("-")) result = (int) result * (-1);
        return (int) result;

    }

    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }
}
