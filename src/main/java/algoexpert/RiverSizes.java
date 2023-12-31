package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RiverSizes {
    public static List<Integer> riverSizes(int[][] matrix) {
        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        boolean[][] visited = new boolean [colLen][rowLen];
        for (boolean[] row : visited) Arrays.fill(row, false);
        List<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < colLen; i++) {
            for (int j = 0; j < rowLen ; j++) {
                if (visited[i][j])
                    continue;
                transverseNode(i, j, matrix, visited, sizes);
            }
        }

        return sizes;
    }

    private static void transverseNode(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> sizes) {
        int currentRiverSize = 0;
        var nodesToExplore = new Stack<Integer[]>();
        nodesToExplore.add(new Integer [] {i,j});

        while (!nodesToExplore.isEmpty()){
            var currentNode = nodesToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
            if (visited [i][j]) {
                continue;
            }

            visited[i][j] = true;
            if (matrix[i][j] == 0) {
                continue;
            }

            currentRiverSize++;

            var unvisitedNeighbors = getUnvisitedNeighbors(i,j, matrix, visited);
            nodesToExplore.addAll(unvisitedNeighbors);


        }

        if(currentRiverSize > 0)
            sizes.add(currentRiverSize);

    }

    private static Stack<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited) {
        var unvisitedNeighbors = new Stack<Integer[]>();

        if(i > 0 && !visited[i - 1][j])
            unvisitedNeighbors.add(new Integer[] {i - 1, j});

        if(i < matrix.length - 1 && !visited[i + 1][j])
            unvisitedNeighbors.add(new Integer[] {i + 1, j});

        if(j > 0 && !visited[i][j - 1])
            unvisitedNeighbors.add(new Integer[] {i, j - 1});

        if(j < matrix[0].length - 1 && !visited[i][j + 1])
            unvisitedNeighbors.add(new Integer[] {i, j + 1});

        return unvisitedNeighbors;
    }
}
