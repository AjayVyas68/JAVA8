package learnjava.collection;

import java.util.List;
import java.util.Vector;

public  class VectorExample {
    public static void main(String[] args) {
        List<String> data = new Vector<>();
        data.add("hello");
        data.add("pm");
        data.add("world");
        data.add("cm");
        int last=data.lastIndexOf("pm");
        int  check=data.indexOf("pm");
        System.out.println(check+" "+last);
        for (String list : data
        ) {

            System.out.println(list);
        }
    }
}
