package another.problem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {

    public static int mySolution(int [] A){
        if(A.length <= 1) return 1;

        Arrays.sort(A);

        return IntStream.range(0, A.length)
                .filter(index -> index + 1 != A[index] )
                .findFirst().orElse(0) + 1;
    }

    public static int solution(int [] A){
        int x1 = A[0];
        int x2 = 1;

        for (int index = 1; index < A.length - 1; index++) x1 ^= A[index];
        for (int index = 2; index < A.length + 1; index++) x2 ^= index;

        return x1 ^ x2;
    }

    public static int fredy(int [] A){
       int len = A.length;
       int sum = ((len + 1) * (len + 2))/2;
       for (int index = 0; index < A.length; index++)
           sum -= A[index];
       return sum;
    }


    public static void main(String[] args) {
        int [] sample = new int[] { 2, 3, 1, 5 };
        int result = fredy(sample);
        System.out.println(result);
    }
}
