package leetcode.string;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.trim().replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int index = 0; index < s.length() ; index++) {
            char c = s.charAt(index);
            if(Character.isLetterOrDigit(c))
                sb.append(c);
        }

        s = sb.toString();

        for(int start = 0, end = s.length() - 1; start < end; start++, end--) {

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
