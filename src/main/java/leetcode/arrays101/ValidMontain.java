package leetcode.arrays101;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ValidMontain {
    public static void main(String[] args) {
        int nums[] = new int[] { 0, 3, 2, 1} ;
        System.out.println(validMountainArray(nums));
    }

    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;

        int midPointerValue = IntStream.of(arr).max().getAsInt();
        int midPointer = 0;

        //get the index of the max value
        for(int index = 0; index < arr.length - 1; index ++)
            if(arr[index] == midPointerValue) {
                midPointer = index;
                break;
            };


        //check left
        for(int index = midPointer; index > 0; index--)
            if(!(arr[index] > arr[index - 1])) return false;


        //check right
        for(int index = midPointer; index < arr.length - 1; index++)
            if(!(arr[index] > arr[index + 1])) return false;

        return true;
    }
}
