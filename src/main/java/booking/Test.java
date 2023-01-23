package booking;

import java.util.LinkedList;
import java.util.List;

public class Test {

    public List<Integer> oddNumbers(int l, int r) {
        List<Integer> res = new LinkedList<>();

        while(l <= r) {
            if(l % 2 == 1)
                res.add(l);

            l++;
        }

        return res;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.oddNumbers(2, 5));
    }
}
