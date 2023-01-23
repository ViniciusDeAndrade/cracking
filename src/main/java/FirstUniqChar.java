import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    public static void main(String[] args) {
//        String s = "aabb";
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int index = 0; index < str.length(); index++) {
            map.put(str.charAt(index), map.getOrDefault(str.charAt(index), 0) + 1);
        }

        // find the index
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1)
                return i;
        }


        return -1;
    }
}
