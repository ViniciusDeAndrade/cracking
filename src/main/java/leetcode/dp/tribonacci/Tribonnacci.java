package leetcode.dp.tribonacci;

import java.util.HashMap;
import java.util.Map;

public class Tribonnacci {

    public int tribonacci(int n) {
        int F[] = new int[38];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;

        for (int index = 3; index <= n ; index++) {
            F[index] = F[index - 1] + F[index - 2] + F[index - 3];
        }
        return F[n];
    }

    public static void main(String[] args) {
        Tribonnacci tribonnacci = new Tribonnacci();

        System.out.println(tribonnacci.tribonacci(25));
    }
}
