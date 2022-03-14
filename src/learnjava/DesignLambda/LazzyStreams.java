package learnjava.DesignLambda;

import java.util.Arrays;
import java.util.List;

public class LazzyStreams {

        private static int length(final String name) {
            System.out.println("getting length for " + name);
            return name.length();
        }
        private static String toUpper(final String name ) {
            System.out.println("converting to uppercase: " + name);
            return name.toUpperCase();
        }

    public static void main(String... args) {
        List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe",
                "Mike", "Susan", "George", "Robert", "Julia", "Parkerh", "Benson");
        final String firstNameWith3Letters=names.stream().filter(x->length(x)==7)
                .map(name->toUpper(name)).findFirst().get();
        System.out.println("Name -:> "+firstNameWith3Letters);
    }

}
