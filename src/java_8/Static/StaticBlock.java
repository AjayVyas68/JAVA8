package java_8.Static;

public class StaticBlock {
/*    Static blocks have the same purpose of instance blocks, initializing variables or executing logic
    operations. But the main difference between both blocks is when the static block is loaded.
    At the moment we access the class the static block will be executed. Differently than the instance
    block that will be only invoked if we create an instance.
    The static block will be initialized before instantiation and the constructor invocation.
    Let’s see a practical example of a static block. We will create a static block and will only access the
    class name in the main method, this will be enough to get the static block invoked.*/
    private static String name;
    static {
        name="java";
    }

public static void main(String[] args) {
    System.out.println(StaticBlock.name);
}
}
