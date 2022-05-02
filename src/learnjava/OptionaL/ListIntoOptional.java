package learnjava.OptionaL;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListIntoOptional {


    public static void main(String[] args) {

        List<String> data= Arrays.asList("ajay" , "vyas"," Nirav");
        Optional<List<String>> list=Optional.of(data);
        Optional<String> c=Optional.of("ajay");
        int size=list.map(List::size).orElse(0);
        System.out.println(size);
        boolean checkData=c.map(String::toUpperCase).filter(s->s.equals("AJAY")).isPresent();
        System.out.println(checkData);
    }
}
