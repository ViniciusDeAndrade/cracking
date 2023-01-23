package leetcode.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasDuplicates {

    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;

        long dup = Arrays.stream(nums).distinct().count();

        return len != dup;
    }

    public int distinct(int[] nums) {
        Map<Integer, Integer> occ = new HashMap<>();

        for (int num: nums) {
            occ.put(num, occ.getOrDefault(num, 0) + 1);
        }

        for (int num: nums) {
            if(occ.get(num) == 1) return num;
        }

        return 0;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().sorted().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().sorted().collect(Collectors.toList());
        int limit1 = nums1.length - 1;
        int limit2 = nums2.length - 1;
        List<Integer> result = new LinkedList<>();

        while (limit1 >= 0 && limit2 >= 0) {
            int val1 = list1.get(limit1);
            int val2 = list2.get(limit2);

            if(val1 > val2) {
               limit1--;
            }

            if(val1 < val2) {
                limit2--;
            }
            if(val1 == val2) {
                result.add(val1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        HasDuplicates has = new HasDuplicates();
        int [] nums1 = new int[] {1,2,2,1};
        int [] nums2 = new int[] {2,2};
        System.out.println(has.intersect(nums1, nums2));
//        System.out.println(has.distinct(new int[] {2, 2, 1} ));
//        System.out.println(has.containsDuplicate(new int[] {1, 2, 3, 1} ));
    }
}
