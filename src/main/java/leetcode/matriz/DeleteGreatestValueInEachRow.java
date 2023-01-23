package leetcode.matriz;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {

    public static void main(String[] args) {
        int [][] m = new int [][] {
                new int[]{81, 9},
                new int[]{33, 17}
        } ;


        DeleteGreatestValueInEachRow d = new DeleteGreatestValueInEachRow();
        System.out.println(d.deleteGreatestValue(m));
    }
    public int deleteGreatestValue(int grid [][]){
        int result = 0;

        for (int r = 0; r < grid.length; r++) {
            int [] row = grid[r];
            int bigger = Arrays.stream(row).max().getAsInt();
            int bigIndex = -1;
            for (int index = 0; index < row.length; index++) {
                if(row[index] == bigger) {
                    bigIndex = index;
                    break;
                }
            }
            result += Math.max(result, bigger);
            row[bigIndex] = -1;


        }

        return result;
    }
}
