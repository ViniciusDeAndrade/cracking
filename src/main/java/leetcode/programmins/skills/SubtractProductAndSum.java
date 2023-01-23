package leetcode.programmins.skills;

public class SubtractProductAndSum {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(239));
    }

    public static int subtractProductAndSum(int n){
        if(n <= 9) return n;


        int sum = 0;
        int prd = 1;

        while(n > 0) {
            int remainder = n % 10;
            n /=  10;
            sum += remainder;
            prd *= remainder;
        }

        return prd - sum;
    }
}
