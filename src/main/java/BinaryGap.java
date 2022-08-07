public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(gap(6));
    }

    public static int gap(int num) {
        String binary = Integer.toBinaryString(num);
        if(!binary.contains("0")) return 0;

        boolean startedCounting = false;
        int maxCounted = 0;
        int counted = 0;

        for (int index = 0; index < binary.length(); index++) {
            String digit = binary.substring(index, index + 1);

            if(digit.equals("1")) {
                if(startedCounting) {
                    if(counted > maxCounted) maxCounted = counted;
                }
                counted = 0;
                startedCounting = true;
            }
            if(digit.equals("0")) counted++;
        }
        return maxCounted;
    }
}
