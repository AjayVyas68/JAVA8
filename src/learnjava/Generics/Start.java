package learnjava.Generics;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("hello");
        list.add(12);
        list.add(new Object());
        list.add(true);
        Integer abc= (Integer) list.get(1);
        System.out.println(abc);
        for (Object c:list)
        {
            System.out.println(c);
        }
    }
}
