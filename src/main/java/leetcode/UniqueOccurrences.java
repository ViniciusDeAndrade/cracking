package leetcode;

import java.util.*;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println(uniqueOccurrences2(nums));
    }

    public static boolean uniqueOccurrences(int[] arr) {
       if(arr.length <= 1) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0 ; index < arr.length; index++) {
            var acc = map.getOrDefault(arr[index], 0) + 1;
            map.put(arr[index] , acc);
        }

        return map.values().stream().distinct().count() == map.values().stream().count();
    }
    public static boolean uniqueOccurrences2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        // Set#add returns false if the set does not change, which
        // indicates that a duplicate element has been added.
        for (Integer each: arr)
            if (!set.add(each))
                return true;
        return false;
    }


}
