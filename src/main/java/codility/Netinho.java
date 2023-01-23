package codility;

public class Netinho {


    public static void main(String[] args) {
//        strokesSampleTest();
    }

    private static void employeesSampleTest() {
        String[] arr1 = {"039", "4", "14", "32", "", "34", "7"}; //5
        String[] arr2 = {"801234567", "180234567", "0", "189234567", "891234567", "98", "9"}; //7
        String[] arr3 = {"5421", "245", "1452", "0345", "53", "354"}; //6

        System.out.println(employees(arr1));
//        System.out.println(employees(arr2));
//        System.out.println(employees(arr3));
    }

    private static void strokesSampleTest() {
        int[] arr1 = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2}; //9
        int[] arr2 = {5, 8}; //8
        int[] arr3 = {1, 1, 1, 1}; // 1
        int[] arr4 = {2}; //8
        int[] sample = {1000000001}; // -1

        System.out.println(strokes(arr1));
        System.out.println(strokes(arr2));
        System.out.println(strokes(arr3));
        System.out.println(strokes(arr4));
        System.out.println(strokes(sample));
    }

    private static int strokes(int[] arr) {
        if (arr == null || arr.length < 1) {
            return -1;
        }
        int result = 0;
        for (int index = 1; index < arr.length; index++) {
            int ant = arr[index - 1];
            int actual = arr[index];
            if (actual < ant) {
                result += Math.abs(actual - ant);
            }
        }

        result += arr[arr.length - 1];
        if(result > 1000000000) return -1;
        return result;
    }

    private static int employees(String [] E) {
        return 0;
    }
}
