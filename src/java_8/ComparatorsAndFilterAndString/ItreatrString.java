package java_8.ComparatorsAndFilterAndString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItreatrString {
    public static void main(String[] args) {
    final String str= "w00t";
    str.chars().filter(ch->Character.isDigit(ch))
            .forEach(ch-> System.out.println(ch));
        List<Person> Data= Arrays.asList(
                new Person("ajay ",20),
                new Person("jay ",34),
                new Person("ay ",36),
                new Person("Vijay ",25)
        );
        List<Person> ResultData=Data.stream().sorted((p,p1)->p.ageDifference(p1)).
                collect(Collectors.toList());
        ItreatrString.printPeople("Sorted " , ResultData);

    }

    private static void printPeople(String msg, List<Person> people) {
        System.out.println(msg);
          people.forEach(System.out::println);
    }


}
