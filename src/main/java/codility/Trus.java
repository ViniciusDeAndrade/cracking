package codility;

import java.util.HashMap;
import java.util.Map;

public class Trus {

    public static void main(String[] args) {
        String s1 = "^vv<v"; // 2
        String s2 = "v>>>vv"; // 3
        String s3 = "<<<"; // 0


        System.out.println(test1(s1));
        System.out.println(test1(s2));
        System.out.println(test1(s3));
    }


    public static int test1(String S){
//        boolean test = S.toCharArray().length == S.length();
//        if(test) return 0;

        Map<String, Integer> occurrences = new HashMap<>();

        S.chars().forEach(ch -> {
            switch (ch) {
                case '>' : occurrences.put(">", occurrences.getOrDefault(">", 0) + 1);
                    break;
                case '<' : occurrences.put("<", occurrences.getOrDefault("<", 0) + 1);
                    break;
                case 'v' : occurrences.put("v", occurrences.getOrDefault("v", 0) + 1);
                    break;
                default: occurrences.put("^", occurrences.getOrDefault("^", 0) + 1);
                    break;
            }

        });

        int max = occurrences.values().stream().max(Integer::max).get();

        occurrences.values().remove(max);
        return occurrences.values().stream().reduce(Integer::sum).orElse(0);

    }
}
