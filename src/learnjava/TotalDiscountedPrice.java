package learnjava;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


class Friends {
    public void getAllFriend() {
        List<String> Frined = Arrays.asList("ajay", "nirav", "kavya");
        List<String> test= Frined.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
        Frined.stream().map((name)->name.toUpperCase(Locale.ROOT)).forEach(System.out::println);
        //Frined.stream().map((x)->x.length()).forEachOrdered(System.out::println);

        System.out.println(String.format("Found %d names",test.size()));
        //   Frined.forEach((final String name) ->System.out.println(name));

    }
}
class predicate
{
    public void predica(){
    List<String> friend = Arrays.asList("ajay", "airav", "ka");
    List<String> friendWith = Arrays.asList("y", "a", "w");
    pickName(friend,"a");
    /*final Function<String,Predicate<String>> startWithLetter=
            letter -> name->name.startsWith(letter);
    final long find=friend.stream().filter(startWithLetter.apply("a")).count();
        System.out.println(find);*/
        System.out.println("total Number" +friend.stream().mapToInt(name->name.length()).sum());
        final Optional<String> aLongName=friend.stream()
                .reduce((name,name1)->name.length()<=name1.length()?name:name1);
        aLongName.ifPresent(name->System.out.println(String.format("A longest Name %s" ,name)));
    }
    public static void pickName(final List<String> names,final String startingLetter){
        final Optional<String> foundName=names.stream().
                filter(name->name.startsWith(startingLetter)).findFirst();
        System.out.println(String.format("A name Start with %s : %s ",startingLetter,
                foundName.orElse("No found")));

    }
}
class JoiningElements
{
    public static void Joining()
    {
        List<String> friend = Arrays.asList("ajay", "airav", "ka");

        System.out.println("Joining ="+friend.
                stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", ")));
    }
}

public class TotalDiscountedPrice {

    public static void main(String[] args) {

        predicate predicate=new predicate();;
        predicate.predica();
        JoiningElements.Joining();

        Friends f = new Friends();
        f.getAllFriend();
        List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));
        final BigDecimal Totalprice = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9))).
                reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("total Discount is =" + Totalprice);
    }
}