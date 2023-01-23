package gym;

import java.util.*;

public class Solution {
    int [] nums1 = new int[] {2,7,11,15}; //0 , 1
    int target1 = 9;

    int [] nums2 = new int[] {2,7,11,15}; //0 , 1
    int target2 = 9;

    public List<Integer> sol2 (int nums [], int target) {
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int j = 0; j< nums.length; j++) {
            mapa.put(nums[j], j);
        }

        for (int j = 0; j < nums.length; j++) {
            int test = nums[j];
            int has = target - test;
            if(mapa.containsKey(has)) {
                result.add(j);
                result.add(mapa.get(has));
                return result;
            }
        }

        return null;
    }

    public List<Integer> solution (int nums [], int target) {
        List<Integer> result = new LinkedList<>();
        for (int j = 0; j< nums.length; j++)
            for (int index = j + 1; index < nums.length; index++) {

                if(nums[j] + nums[index] == target) {
                    result.add(j);
                    result.add(index);
                    return result;
                }
            }

        return null;
    }
}
