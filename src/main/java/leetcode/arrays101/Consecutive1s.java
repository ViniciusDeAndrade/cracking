package leetcode.arrays101;

public class Consecutive1s {
    public static void main(String[] args) {
        int nums[] = new int[] { 1,1,0,1,1,1} ;
        System.out.println(solution(nums));
    }

    public static int solution(int [] nums) {
        if(nums.length == 0) return 0;

        int result = 0;
        int counter = 0;

        for(int num : nums) {
            if(num == 1) counter++;
            else {
                if(counter > result) {
                    result = counter;
                    counter = 0;
                }
            }
        }

        return Math.max(result, counter);
    }
}
