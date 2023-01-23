package leetcode.programmins.skills;

public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int res = countOdds(2, 7);
        System.out.println(res);
    }

    public static int countOdds(int low, int high) {
        int test = high - low + 1;
        if (low % 2 == 0 || high % 2 == 0) return test / 2;
        return (test / 2) + 1;
    }
}
