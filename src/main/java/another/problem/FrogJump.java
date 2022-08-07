package another.problem;

public class FrogJump {

    public static int solution(int x, int y, int D) {
        int distanceBetweenPoints = y - x;
        double result = Math.ceil((double) distanceBetweenPoints/D);
        return (int) result;
    }
    public static void main(String[] args) {
        int result = solution(10, 85, 30);
        System.out.println(result);
    }
}
