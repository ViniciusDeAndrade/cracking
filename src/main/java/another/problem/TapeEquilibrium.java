package another.problem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TapeEquilibrium {

    public static int solution(int A[]) {
        int result = 0;
        int part1 = 0;
        int part2, resultTemp;
        int maxP = A.length - 1;
        for (int index = 0; index < maxP; index++) {
            part1 += A[index];
            part2 = 0;
            for (int i = index + 1; i < A.length; i ++)
                part2 += A[index];
            resultTemp = Math.abs(part1 - part2);
            System.out.println("part1: " + part1);
            if(result == 0 || result > resultTemp) {
              result = resultTemp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int test[] = new int[] { 3, 1, 2, 4, 3 };
        System.out.println("result " + genial(test));
    }

    public static int genial(int A[]) {
        int leftSum = A[0];
        int rightSum = Arrays.stream(A).sum() - leftSum;
        int rawDiff = rightSum - leftSum;
        int diff = Math.abs(rawDiff);

        for (int P = 1; P < A.length - 1; P++) {
            rawDiff -= 2*A[P];
            if(Math.abs(rawDiff) < diff) diff = Math.abs(rawDiff);
        }

        return diff;
    }
}
