package learnjava.OptionaL;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.Optional;

public class OrElseget {
    static void printfoodIfPresent()
    {
        Optional<String> optional=Optional.empty();
        String food=optional.orElseGet(
                OrElseget::askFood);
        System.out.println(food);
    }

     static String askFood() {
        String food1="No Food ";
        String takeFood="mario needs to go food";
        return food1.concat(takeFood);

    }

    public static void main(String[] args) {
        OrElseget.printfoodIfPresent();
    }
}
