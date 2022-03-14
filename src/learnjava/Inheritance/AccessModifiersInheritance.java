package learnjava.Inheritance;

public class AccessModifiersInheritance {


    public static void main(String[] args) {
        System.out.println(new AccessModifiersInheritance());
//        var hiddenModifier=new AccessModifiersInheritance();
        //System.out.println(hiddenModifier.equals(hiddenModifier));
    }

    @Override
    public String toString() {
        return  "the HiddenModifier";
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }
}