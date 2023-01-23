package leetcode.array;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }


    public int maxProfit(int[] prices) {

        int profit = 0;

        for (int index = 1; index < prices.length; index++) {
            if(prices[index] > prices[index - 1])
                profit += prices[index] - prices[index - 1];
        }

        return profit;
    }
}
