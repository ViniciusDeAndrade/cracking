package cracking;


import java.util.Arrays;

public class StringProblems {

    public static void main(String[] args) {
        String sample = "varei voti arriegua";
        System.out.println(isUniqueChars(sample));

        System.out.println("perm: " + isPermutation("roma", "amor"));

        System.out.println("one way: " + oneWay("pale", "ple"));
        System.out.println("one way: " + oneWay("pale", "pales"));
        System.out.println("one way: " + oneWay("pale", "bake"));

    }

    public static boolean isUniqueChars(String srt) {
        var charNum = srt.chars().distinct().count();
        return srt.length() == charNum;
    }

    public static boolean isPermutation(String str1, String str2) {
        if(str2.length() != str1.length()) return false;
        return sort(str1).equals(sort(str2));
    }

    public static boolean oneWay(String str1, String str2) {
        long len1 = str1.length();
        long len2 = str2.length();

        if(Math.abs(len1 - len2) > 1) return false;

        var chars1 = str1.toCharArray();
        var chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        int countEdit = 0;
        for (int index = 0 ; index < Math.min(chars1.length, chars2.length); index ++) {
            if(chars1[index] != chars2[index])
                countEdit++;
        }

        return countEdit <= 1;

    }


    private static String sort(String s) {
        var content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
