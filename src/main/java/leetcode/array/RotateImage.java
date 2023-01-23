package leetcode.array;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int col = 0;
        while (col < matrix[0].length){
            for (int row = 0; row < matrix.length; row++ )
                matrix[row][col] = matrix[col][row];
            col++;
        }
    }
}
