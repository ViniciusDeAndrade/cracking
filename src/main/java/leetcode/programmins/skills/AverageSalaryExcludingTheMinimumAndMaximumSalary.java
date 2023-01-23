package leetcode.programmins.skills;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int salary[] = {4000,3000,1000,2000};
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
    public static double average(int[] salary) {
        if(salary.length == 3) {
            Arrays.sort(salary);
            return salary[1];
        }
        int max = salary[0];
        int min = salary[0];

        int sum = salary[0];

        for (int index = 1; index < salary.length; index ++){
            min = Math.min(min, salary[index]);
            max = Math.max(max, salary[index]);
            sum += salary[index];

        }

        return (sum - max - min)/ (salary.length - 2);
    }
    public static int hammingWeight(int n) {
        int counter = 0;
        while (n != 0) {
            counter++;
            n &= n - 1;
        }
        return counter;

    }
}
