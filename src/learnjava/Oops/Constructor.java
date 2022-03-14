package learnjava.Oops;

public class Constructor {
    private final String name;
    private final String color;

    /*
        *               A constructor in Java is a special type of method whose main responsibility is to construct (create)
             an object of a class with certain attribute values.
        *               You can also invoke methods in the constructor,but its primary use is to define the object’s
        *    state by providing initial values for its attributes .
        *               If you don’t declare a constructor, the JVM will create one automatically for you. When you
             instantiate a new object, you are always invoking a constructor
         */
    public Constructor (String name ,String color)
    {
        this.name=name;
        this.color=color;
    }

    public static void helo(String[] args) {
      Constructor v = new Constructor("bmw","black");
        System.out.println(v.color);
        System.out.println(v.name);
    }

}
