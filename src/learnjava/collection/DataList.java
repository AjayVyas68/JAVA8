package learnjava.collection;

import java.util.ArrayList;
import java.util.List;

public class DataList {
    public static void main(String[] args) {
        List<String> data=List.of("ajay","reee","aakash");
        data.add("ajay");
        data.forEach(System.out::println);
    }
}
