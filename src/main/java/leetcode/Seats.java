package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seats {

    public static void main(String[] args) {
        Seats seats = new Seats();
        int n1 = 2;
        int n2 = 1;
        int n3 = 22;
        String s1 = "1A 2F 1C";
        String s2 = "1A 3C 2B 20G 5A";
        String s3 = "1A 3C 2B 20G 5A";
//        int num = seats.solution(n1, s1);
        int num = seats.solution(n3, s3);
        System.out.println(num);
    }

    public int solution(int N, String S) {
        if (S.isEmpty()) return N * 2;

        String[] occupied = S.split(" ");

        String center = "DEFG";
        String left = "ABC";
        String right = "HJK";

        int result = 0;

        for (int index = 0; index < N; index++) {
            final int i = index;
            List<String> row = Arrays
                    .stream(occupied)
                    .filter(str -> str.matches(i + 1 + "[A-Z]"))
                    .collect(Collectors.toList());

            if (row.isEmpty()) {
                result += 2;
                continue;
            }

            String s = row.stream().reduce((el1, el2) -> el1 + el2).get();

            if (s.contains("F") && s.contains("E")) continue;

            if (s.contains("F")) {
                if (!s.contains(left)) {
                    result += 1;
                    continue;
                }
            }

            if(s.contains("E")) {
                if(!s.contains(right)) {
                    result += 1;
                    continue;
                }
            }
            boolean notBCHJ = !s.contains("B") && !s.contains("C") && !s.contains("H") && !s.contains("J");

            if(s.contains("A")) {
                if(!s.contains(center)) {
                    result += 1;
                }
                if(notBCHJ) {
                    result += 1;
                }
                continue;
            }

            if(s.contains("K")) {
                if(!s.contains(center)) {
                    result += 1;
                }
                if(notBCHJ) {
                    result += 1;
                }
                continue;
            }
            result += 1;

        }

        return result;
    }

}
