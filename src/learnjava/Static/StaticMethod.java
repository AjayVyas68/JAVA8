package learnjava.Static;

public class StaticMethod {
    public static void main(String... doYourVest) {
/*        We are invoking the static method right away, without the necessity of having an instance,
        that’s why a static method is also called as a class method
        */
        /*
        * Similarly to static attributes, static methods follow the same concept. A static method can be
invoked without an instance.*/


        // when to use static method
        /*
        * You can ask yourself, can this method be invoked without any instance variable state? Is this method
simple enough? Only then you should make the decision of creating a static method*/
        StaticMethod.print();
    }

    private static void print() {
//        We only need to specify the static keyword in the print method to make it static
        System.out.println("static method no Instance Required");
    }
}
