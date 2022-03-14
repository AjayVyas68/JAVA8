package learnjava.Encapsulation;

import learnjava.Encapsulation.test.Modifiers;

public class AccessModifiers extends Modifiers {
    public static void main(String[] args) {
        Modifiers accessModifiers=new Modifiers();
        System.out.println(accessModifiers.name);
        System.out.println(new AccessModifiers().access);

    }
}
