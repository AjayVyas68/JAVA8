package java_8.DesignLambda;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

public class DealingWithException {
    public static void main(String[] args) {

        Stream.of("/usr","tmp").map(path->{
            try {
                return new File(path).getCanonicalPath();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return path;
        }).forEach(System.out::println);
    }
}
