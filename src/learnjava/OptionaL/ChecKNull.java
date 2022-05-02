package learnjava.OptionaL;

import java.util.Optional;

public class ChecKNull {
    public static void main(String[] args) {
        String snop="endlos";
        Optional<String> checkGetOrNot=Optional.ofNullable(snop);
        checkGetOrNot.ifPresent(s -> System.out.println(snop.concat("pvt ltd")));

//        if (checkGetOrNot.isPresent())
//        {
//            System.out.println("value is present"+checkGetOrNot.get());
//        }
//        else
//        {
//            System.out.println("value is Not Present");
//        }





        Optional<String> emptyOp=Optional.ofNullable(null);

        System.out.println(emptyOp.isPresent());

    }
}
