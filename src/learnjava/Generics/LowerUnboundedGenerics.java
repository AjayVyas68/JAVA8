package learnjava.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowerUnboundedGenerics {
    public static void main(String[] args) {
        List<Number>  data=new ArrayList<>();
        data.add(7.0);
        data.add(15);
        List<? super String> result=addNumbers(data);
        System.out.println(result);
    }

    private static List<? super String> addNumbers(List<Number> data) {
        data.add(25);
        return Collections.singletonList(data);
    }
}
