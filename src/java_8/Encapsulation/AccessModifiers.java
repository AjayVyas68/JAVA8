package java_8.Encapsulation;

import java_8.Encapsulation.test.Modifiers;

import java.lang.reflect.Modifier;

public class AccessModifiers extends Modifiers {
    public static void main(String[] args) {
        Modifiers accessModifiers=new Modifiers();
        System.out.println(accessModifiers.name);
        System.out.println(new AccessModifiers().access);

    }
}
