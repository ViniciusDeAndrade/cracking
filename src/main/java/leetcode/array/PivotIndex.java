package leetcode.array;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class PivotIndex {


    public static void main(String[] args) {
//        int [] nums1 = {1,7,3,6,5,6}; //3
//        int [] nums2 = {1, 2, 3}; // -1
//        int [] nums3 = {2, 1 , -1}; //0
//        PivotIndex pivotIndex = new PivotIndex();
//

        Scanner inputReader = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (inputReader.hasNext()){
            int number = inputReader.nextInt();
            numbers.add(number);
        }
        Integer result = 0;

        // TODO: Implement your logic to check which number has only one occurrence in List "numbers".
        for (Integer number : numbers) {
            //Tip: For this, a useful method can be the "Collections.frequency(list, value)".

            int frequency = Collections.frequency(numbers, number);
            if(frequency == 1) {
                result = number;
                break;
            }
        }
        System.out.println(result);
    }
    public int pivotIndex(int[] nums) {

        int len = nums.length;
        int index = 0;

        int test = 0;
        
        System.out.println(test);

        while (index < len) {
            if(index == 0) {
                int sum = 0;
                for (int j = index + 1; j < len ; j++) {
                    sum += nums[j];
                }
                if(sum == index) return 0;

            } else {
                int leftSum = 0;
                for (int j = 0; j < index ; j++) leftSum += nums[j];

                int rightSum = 0;
                for (int j = index + 1; j < len ; j++) rightSum += nums[j];

                if(leftSum == rightSum) return index;
            }

            index++;
        }

        return -1;
    }

    public static void test() {
        int resultado = (int) Math.ceil((3 * 5) / 4);

        System.out.println(resultado);
    }


}
