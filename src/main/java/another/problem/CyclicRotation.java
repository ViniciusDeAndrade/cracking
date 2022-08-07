package another.problem;

import java.util.Arrays;

public class CyclicRotation {

//    A = [3, 8, 9, 7, 6]
    public static void main(String[] args) {
        var result = rotate(
                new int[]{3, 8, 9, 7, 6} , 3
        );
        Arrays.stream(result).asLongStream().forEach(System.out::println);
    }

    public static int[] rotate(int[] A, int K) {
        if(A.length == K) return A;
        if(Arrays.stream(A).distinct().count() <= 1) return A; //all elements are equal

        int [] result = new int[A.length];
        for (int index = 0; index < A.length; index ++)
//            result[index] = A[calculateIndex(A.length, index, K)] ;
            result[(index + K) % A.length] = A[index];

        return result;
    }

    private static int calculateIndex (int len, int index, int K) {

        if(len >= index + K)
            return index + K - 1;

        return index - K ;
    }
}
