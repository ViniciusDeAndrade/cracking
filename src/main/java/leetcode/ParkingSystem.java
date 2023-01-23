package leetcode;

public class ParkingSystem {
    private int small;
    private int medium;
    private int big;

    private static final int BIG = 1;
    private static final int MEDIUM = 2;
    private static final int SMALL = 3;

    public ParkingSystem(int big, int medium, int small) {

        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    @Override
    public String toString() {
        return "ParkingSystem{" +
                "small=" + small +
                ", medium=" + medium +
                ", big=" + big +
                '}';
    }

    public boolean addCar(int carType) {
//        System.out.println(this);

        return switch (carType) {
            case BIG -> {
                if (this.big > 0) {
                    this.big--;
                    yield true;
                }
                yield false;
            }
            case MEDIUM -> {
                if (this.medium > 0) {
                    this.medium--;
                    yield true;
                }
                yield false;
            }
            case SMALL -> {
                if (this.small > 0) {
                    this.small--;
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }


    public static void main(String[] args) {
        var ps = new ParkingSystem(1, 1, 0);
        print(ps.addCar(1)); //T
        print(ps.addCar(2)); //T
        print(ps.addCar(3)); //F
        print(ps.addCar(1)); //F
    }
    public static void print(Object o){
        System.out.println(o);
    }
}
