package leetcode.array;

public class MaxProfitDp {

    public static void main(String[] args) {
        MaxProfitDp maxProfit = new MaxProfitDp();
        System.out.println(maxProfit.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }


    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int index = 1; index < prices.length; index++) {
//            if(prices[index] <= prices[index - 1]) continue;
            if(prices[index] > max) max = prices[index];
            if(prices[index] < min) min = prices[index];
        }

        return max - min;
    }


}
