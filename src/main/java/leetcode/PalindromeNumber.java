package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeWithoutString(121));
    }

    //eu quem fiz e funciona. Mas cria string
    //TC: O(n) ?
    //SC: O(n) ?
    public static boolean isPalindrome(int x) {
        var numStr = String.valueOf(x);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    public static boolean isPalindromeWithoutString(int x) {
        if(x < 0){
            return false;
        }

        int reverseNum = 0;
        int lastDigit = 0;
        int temp = x; //mind it!

        while(x != 0) {
            lastDigit =x % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            x /= 10;
        }

        return reverseNum == temp;
    }
}
