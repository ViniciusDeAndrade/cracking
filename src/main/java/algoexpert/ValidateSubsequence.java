package algoexpert;

import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {

    }
    public static boolean isValidSubsequence(
        List<Integer> array, List<Integer> sequence
    ) {
        // Write your code here.

        if(array.equals(sequence)) return true;

        int sequenceIndex = 0;

        for (Integer element : array) {

            if (element.equals(sequence.get(sequenceIndex))) sequenceIndex++;

            if (sequenceIndex == sequence.size()) return true;

        }

        return false;
    }

}
