package java_8.Static;

public class StaticAccessToThis {
    private String name;
    public static void main(String[] args) {
/*        In a real-world project we usually use static attributes when we want to declare a constant attribute
        value. Since the value will be the same no matter if a new instance is created, it’s a common approach
        to see constant attributes declared as static:*/
     StaticAccessToThis toThis = new StaticAccessToThis();
     toThis.name="hello world";
        print(toThis);
    }

    private static void print(StaticAccessToThis toThis) {
        System.out.println(toThis.name);
    }

}
