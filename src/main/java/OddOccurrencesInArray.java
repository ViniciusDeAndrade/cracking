import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {

        int [] sample = new int[] {9 , 3 , 9 , 3, 9, 9, 7};
        int result = superSolution(sample);
        System.out.println(result);
    }

    public static int superSolution(int[] A) {
        int unpaired = 0;
        for (int index = 0; index < A.length; index++) {
            unpaired ^= A[index];
            System.out.println("unpaired: " + unpaired);
        }
        return unpaired;
    }

        public static int solution(int[] A) {
        Map<Integer, Integer> ocurrences = new HashMap<>();
        for (int index = 0; index < A.length; index++) {
            if (ocurrences.keySet().contains(A[index])) {
                ocurrences.put(
                    A[index], ocurrences.get(A[index]) + 1
                );
            } else {
                ocurrences.put(A[index], 1);
            }
        }
        int valAlone = ocurrences.values().stream().filter(val -> val % 2 == 1).findFirst().get();
        return ocurrences.entrySet().stream()
                .filter(entry -> entry.getValue() == valAlone)
                .map(Map.Entry::getKey)
                .findFirst().get();
    }
}
