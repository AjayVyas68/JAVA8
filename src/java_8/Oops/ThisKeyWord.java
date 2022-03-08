package java_8.Oops;

public class ThisKeyWord {
    String color;
    String name;

    /*
            The keyword this in Java provides a way of referencing the current instance, so that we can access
        its state (attributes) or behavior (methods)
            A common use of the keyword this is to differentiate between instance and local variables with the
        same names, so that it’s clear which ones we want to access. In the following example, we explore
        what happens if we don’t make use of this in a case like this.
    */
    public void setUp(String address,String color) {
        this.color = color;
        name = "puppy";
        this.Address(address);
    }

    public void Address(String address) {
        System.out.println("Address is " + address);
    }


    public static void main(String[] args) {
        ThisKeyWord t = new ThisKeyWord();
        t.setUp("rajkot","black");
        System.out.println(t.color);
        System.out.println(t.name);
    }
}
