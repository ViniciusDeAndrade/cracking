import java.util.stream.Stream;

public class GPS {

    public static void main(String[] args) {
        double [] x = { 0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25 };
        int s = 15;
    }

    public static long gps(double [] x, int s) {
        if(x.length <= 1) return 0;

        long floor = 0;
        for(int index = 0; index < x.length - 2; index++ ){
            double deltaDistance = Math.abs(x[index] - x[index + 1]);
            double hourlySpeedSnapshot = 3600*deltaDistance/s;
            if(hourlySpeedSnapshot > floor)
                floor = Math.round(hourlySpeedSnapshot);
        }

        return floor;
    }
}
