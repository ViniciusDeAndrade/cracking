package hackerhank;

public class Bitwise {

    public static void main(String[] args) {
        Bitwise bitwise = new Bitwise();
        System.out.println(bitwise.getBit(15, 2));

        System.out.println(bitwise.setBit(11, 2));
    }

    /**
     * this method tells if the ith bit in num is 1
     * @param num decimal number that will be turned in binary
     * @param i the -ith element/bit that will be tested.
     * @return if the element/bit is 1 then true will be returned. If it is 0, logically the method will return false
     */
    public boolean getBit(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    /**
     * this method returns num input with 1 in the ith position and the other bits unchanged
     * @param num the number you wish to set the ith bit as 1
     * @param i the ith bit
     * @return num input with 1 in the ith position and the other bits unchanged
     */
    public int setBit(int num, int i) {
        return num | (1 << i);
    }
}
