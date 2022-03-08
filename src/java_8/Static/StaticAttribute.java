package java_8.Static;

public class StaticAttribute {
    /*
              The purpose of the static keyword is to make classes/methods/attributes static in memory, this
      means that it’s not necessary to create an instance to make use of a static class, method or attribute.
              Therefore, when we don’t want to instantiate a class and use attributes or methods straightaway we
       can declare our attributes and methods by using the static keyword.
              Methods and attributes declared as static will be ready to be used only by referencing the enclosing
      class.
      */

//    This attribute is already static in the memory-heap .
    static String staticPower;

    public static void main(String[] args) {
/*        It’s possible to use the staticEnergy variable straight away without the need of instantiating
        the StaticAttributes class. In this line we basically assign "Very Strong" to the staticEnergy
        variable.
        */
        StaticAttribute.staticPower = "very Strong";
        System.out.println(staticPower);
    }
}