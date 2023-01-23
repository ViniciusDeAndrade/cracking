package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinPositiveNotOccured {

    public static void main(String[] args) {
        int [] nums = {1, 3, 6, 4, 1, 2};
        System.out.println(test1(nums));
    }


    public static int test1(int []A){
        var max = Arrays.stream(A).max().getAsInt();
        if(max < 0) return 1;

        Arrays.sort(A);
        A = Arrays.stream(A).distinct().filter(num -> num >= 0).toArray();

        for(int index = 1; index < A.length; index++) {
            int before = A[index -1];
            int actual = A[index];
            if(actual - before != 1) return actual -1;
        }

        return A.length + 1;
    }
}
