package learnjava.Ol;

import java.math.BigDecimal;

public class MatrixWrapper {
    static String result = "";

    public static void main(String[] args) {

            wrapBullets(5, 5D);
            wrapBullets(1L, 5);
            wrapBullets(new BigDecimal(4), 5D);
            wrapBullets(5, 4);
            wrapBullets((short) 5.0, 5.);
        System.out.println(result);
}

    private static void wrapBullets(Integer integerWrapper, Double doubleWrapper) {
        result += "A";
    }
    private static void wrapBullets(Short shortWrapper, Double doubleWrapper) {
        result += "B";
    }
    private static void wrapBullets(Number numberWrapper, Double doubleWrapper) {
        result += "C";
    }
    private static void wrapBullets(double doublePrimitive, int intPrimitive) {
        result += "D";
    }

    }
