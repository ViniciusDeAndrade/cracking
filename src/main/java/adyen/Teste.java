package adyen;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teste {

    public static final BigInteger visaStart1 = new BigInteger("400000000000");
    public static final BigInteger visaEnd1 = new BigInteger("419999999999");

    public static final BigInteger visaDebitStart = new BigInteger("420008000000");
    public static final BigInteger visaDebitEnd = new BigInteger("420008999999");

    public static final BigInteger visaStart2 = new BigInteger("435000000000");
    public static final BigInteger visaEnd2 = new BigInteger("435000999999");

    public static final BigInteger mcStart = new BigInteger("540000000000");
    public static final BigInteger mcEnd = new BigInteger("599999999999");

    static Map<String, String> cardMap = new HashMap<>();

    public static void main(String[] args) {
        Teste teste = new Teste();
    }

    static final class BinRange {
        String start, end, cardType;

        BinRange(String start, String end, String cardType) {
            cardType = cardType;
            start = start;
            end = end;
        }
    }

    interface CardTypeCache {

        String get(String cardNumber);
    }

    class MC implements CardTypeCache {
        @Override
        public String get(String cardNumber) {
            return "mc";
        }
    }

    class VisaDebit implements CardTypeCache {
        @Override
        public String get(String cardNumber) {
            return "visadebit";
        }
    }

    static class Visa implements CardTypeCache {
        @Override
        public String get(String cardNumber) {
            return "visa";
        }
    }

    public static CardTypeCache buildCache(List<BinRange> binRanges) {
        return binRanges.stream().map(Teste::checkInterval).collect(Collectors.toList()).stream().findFirst().get();
    }

    private static CardTypeCache checkInterval(BinRange bin) {
        var interval = new BigInteger(bin.end).subtract(new BigInteger(bin.start));

        if(interval.compareTo(mcStart) == 0
                || interval.compareTo(mcEnd) == 0
                || interval.compareTo(mcStart) == 1
                && interval.compareTo(mcEnd) == -1)   {
            cardMap.put(interval.toString(), "mc");
            return new Visa();
        }

        if(interval.compareTo(visaDebitStart) == 0
                || interval.compareTo(visaDebitEnd) == 0
                || interval.compareTo(visaDebitStart) == 1
                && interval.compareTo(visaDebitEnd) == -1)   {
            cardMap.put(interval.toString(), "visadebit");
            return new Visa();
        }

        if(interval.compareTo(visaStart1) == 0
                || interval.compareTo(visaEnd1) == 0
                || interval.compareTo(visaStart1) == 1
                && interval.compareTo(visaEnd1) == -1)   {
            cardMap.put(interval.toString(), "visa");
            return new Visa();
        }

        if(interval.compareTo(visaStart2) == 0
                || interval.compareTo(visaEnd2) == 0
                || interval.compareTo(visaStart2) == 1
                && interval.compareTo(visaEnd2) == -1)   {
            cardMap.put(interval.toString(), "visa");
            return new Visa();
        }

        return null;

    }


}
