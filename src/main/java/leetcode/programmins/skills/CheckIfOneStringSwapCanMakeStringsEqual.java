package leetcode.programmins.skills;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

        var chars1 = s1.toCharArray();
        var chars2= s2.toCharArray();

        List<String> list = new LinkedList<>();

        int counter = 0;
        for(int index = 0; index < chars1.length; index++) {
            if(chars1[index] != chars2[index]){
                counter++;
                list.add(String.valueOf(chars2[index]));
            }
            if(counter > 2) return false;
        }

        int firstIndex = s2.indexOf(list.get(0));
        int secondIndex = s2.indexOf(list.get(1));

//        s2.

        return false;
    }
}
