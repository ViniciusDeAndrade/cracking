package booking;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Avaliacao {
    private String positiveKeyword;
    private String negativeKeyword;
    private Integer hotelId;
    private String review;

    private int points;

    public Avaliacao(String positiveKeyword, String negativeKeyword, Integer hotelId, String review) {
        this.positiveKeyword = positiveKeyword;
        this.negativeKeyword = negativeKeyword;
        this.hotelId = hotelId;
        this.review = review;
        this.calculate();
    }

    private void calculate() {
        int positiveCount = 0;
        int negativeCount = 0;
        var positiveWords = positiveKeyword.split(" ");
        var negativeWords = negativeKeyword.split(" ");

        for (int index = 0; index < positiveWords.length; index++){
            if(review.contains(positiveWords[index])) positiveCount++;
        }

        for (int index = 0; index < negativeWords.length; index++){
            if(review.contains(negativeWords[index])) negativeCount++;
        }

        this.points = 3 * positiveCount - negativeCount;
    }


    public String getPositiveKeyword() {
        return positiveKeyword;
    }

    public String getNegativeKeyword() {
        return negativeKeyword;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public String getReview() {
        return review;
    }

    public int getPoints() {
        return points;
    }

    public static void main(String[] args) {

        Solution t = new Solution();

    }
}

class Solution{
    public List<Integer> awardTopKHotels(String positiveKeywords, String negativeKeywords, List<Integer> hotelIds, List<String> reviews, int k) {
        List<Avaliacao> avaliacaos = new LinkedList<>();
        for (int index = 0; index < hotelIds.size(); index++) {
            avaliacaos.add(new Avaliacao(positiveKeywords, negativeKeywords, hotelIds.get(index), reviews.get(index)));
        }

        return avaliacaos.stream().sorted(Collections.reverseOrder()).limit(k).map(Avaliacao::getHotelId).collect(Collectors.toList());
    }

}
