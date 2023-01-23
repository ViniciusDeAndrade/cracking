package booking;

import java.util.*;
import java.util.stream.Collectors;

public class TestVera {

    public static long beautifulSubarrays(List<Integer> arr, int numOdds) {
        long odds = arr.stream().filter(n -> n % 2 == 1).count();
        if(numOdds > odds) return 0L;

        List<List<Integer>> diff = new LinkedList<>();
        int helper = numOdds;

        for (int index = 0; index < arr.size(); index++) {
            List<Integer> count = new LinkedList<>();

            for (int j = index + 1; index < arr.size() - 1; j++) {
                if(arr.get(j) % 2 == 1) helper--;
                if(helper == 0) break;

                count.add(arr.get(j));
            }
            diff.add(count);
            helper = numOdds;
        }

        return diff.size();
    }

    public char maximumOccurringCharacter(String text) {
        var chars = text.toCharArray();
        var map = new HashMap<Character, Integer>();
        for (char c: chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxOccurrences = map.values().stream().max(Integer::compareTo).get();
        System.out.println("ocorreu " + maxOccurrences);

        for (char c: chars) {
            int isIt = map.get(c);
            if(isIt == maxOccurrences) return c;
        }

        return ' ';
    }

    public List<Integer> awardTopKHotels(String positiveKeywords, String negativeKeywords, List<Integer> hotelIds, List<String> reviews, int k) {
        Map<Integer, Integer> hotelByPoints = new HashMap<>();
        final int positiveFactor = 3;
        final int negativeFactor = 1;

        for(int index = 0; index < reviews.size(); index ++) {
            String review = reviews.get(index);
            Integer hotelId = hotelIds.get(index);
            int positiveWord = 0;
            int negativeWord = 0;

            if(review.contains(positiveKeywords)) {
                String[] words = review.split(" ") ;
                for (String word: words) {
                    if(positiveKeywords.contains(word)) positiveWord++;
                }
            }

            if(review.contains(negativeKeywords)) {
                String[] words = review.split(" ") ;
                for (String word: words) {
                    if(negativeKeywords.contains(word)) negativeWord++;
                }
            }

            hotelByPoints.put(hotelId, (positiveFactor * positiveWord) - (negativeFactor *negativeWord));

        }

        var list = hotelByPoints.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(el -> el.getKey()).collect(Collectors.toList());

        List<Integer> result = new LinkedList<>();

        for (int i = 0 ; i < k; i++) result.add(list.get(i));

        return result.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        TestVera t = new TestVera();
        String text  = "abbbaacc"; //a

        ;
        System.out.println(t.beautifulSubarrays(List.of(2,5,4,9), 1));
    }
}
