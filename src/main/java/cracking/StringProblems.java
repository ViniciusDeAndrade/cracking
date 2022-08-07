package cracking;


public class StringProblems {

    public static void main(String[] args) {
        String sample = "varei voti arriegua";
        System.out.println(isUniqueChars(sample));

    }

    public static boolean isUniqueChars(String srt) {
        var charNum = srt.chars().distinct().count();
        return srt.length() == charNum;
    }
}
