package learnjava.Generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        List<Integer> data=new ArrayList<>();

        data.add(12 );
        printNumber(data);
        List<BigDecimal> data1=new ArrayList<>();
        data1.add(BigDecimal.TEN);
        printNumber(data1);
    }

    private static void printNumber(List<? extends Number> data) {
        data.forEach(System.out::println);
    }
}
