package learnjava.OptionaL;

import java.util.Optional;

public class OrELseThrowInOptional {
    public static void main(String[] args) {

        String name=null;
        Object check= Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
        System.out.println(check);
        String result=Optional.ofNullable(name).map(s -> s.concat("pvt ltd")).orElse("no value");
        System.out.println(result);
    }
}
