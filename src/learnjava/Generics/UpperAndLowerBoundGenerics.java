package learnjava.Generics;

public class UpperAndLowerBoundGenerics {
    public static void main(String[] args) {
        Integer upperBound=concatString(10);
        System.out.println(upperBound);
    }

     static <T extends Integer> Integer concatString(T hello) {
        return hello.bitCount(2);
    }
}
