package trustly;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Pro1 {
    public int solution(String[] R) {
        Map<String, String> path = new HashMap<>();
        int rows = R.length;
        int cols = R[0].length();
        boolean flag;
        int initRowIndex = 0;
        int initColIndex = 0;
        int dir = 0; //east
        do {
            flag = false;
            String row = R[initRowIndex];
            String col = String.valueOf(row.charAt(initColIndex));

            if(dir % 2 == 0) {

            } else {

            }
            dir++;

//            for (int c = 0; c < cols; c++) {
//                String symbol = String.valueOf(row.charAt(c));
//                if(symbol.equals("."))
//                    if(!path.containsKey(r + " " + c)) {
//                        path.put(r + " " + c, symbol);
//                        flag = true;
//                    }
//                    else {
//
//                    }
//            }

        } while(flag);

        return Long.valueOf(path.values().stream().count()).intValue();
    }

    public static void main(String[] args) {
        String a [] = {"...x.." , "....xx", "..x..."};
        Pro1 pro = new Pro1();
        System.out.println();
    }
}
