package leetcode.matriz;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        RichestCustomerWealth rich = new RichestCustomerWealth();
        int [][] m = new int [][] {
            new int[]{1, 2, 3},
            new int[]{3, 2, 1}
        } ;

        int r = rich.maximumWealth(m);
        System.out.println(r);
    }

    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for(int r = 0; r < accounts.length; r++) {
            int [] row = accounts[r];
            result = Math.max(result, Arrays.stream(row).reduce(0, Integer::sum));
        }

        return result;
    }
}
