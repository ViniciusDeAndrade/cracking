package leetcode.dp.climbing;

import java.util.Arrays;

public class MinCostClimbingStairs {

    int memo[] = new int[1000];

    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(memo, -1);
        return minClimbCost(0, cost);
    }

    private int minClimbCost(int index, int[] cost) {
        if (index <= 1) {
            return 0;
        }

        if(memo[index] > -1 ) return memo[index];

        memo[index] = Math.min(
                minClimbCost(index - 1, cost) + cost[index - 1],
                minClimbCost(index - 2, cost) + cost[index - 2]
        );

        return memo[index];
    }

    public static void main(String[] args) {
        var cost1 = new int[]{10, 15, 20}; //15
        var cost2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        var costClimb = new MinCostClimbingStairs();
        int result = costClimb.minCostClimbingStairs(cost1);
        System.out.println("result = " + result);
    }
}
