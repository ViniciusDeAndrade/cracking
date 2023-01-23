package leetcode.amazon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
//        int nums[] = {1, 2, 3, 4};
        int nums[] = {3,6,1,0};
        dominantIndex(nums);
    }

    public static int dominantIndex(int[] nums) {

        var max = IntStream.of(nums).max().getAsInt();

        var list = IntStream.of(nums).boxed().collect(Collectors.toList());
        var maxIndex = list.indexOf(max);
        list.remove((Object) max);

        var secondMax = list.stream().max(Integer::compareTo).get();

        return secondMax <= max / 2 ? maxIndex : -1;

    }
}
