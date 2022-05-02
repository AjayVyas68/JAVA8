package learnjava.Generics;

public class Generics{
    public  <T>T doSomething(T type)
    {
        System.out.println(type.getClass());
        return type;
    }

    public static void main(String[] args) {
        Generics generics=new Generics();

        String world=generics.doSomething("hrrlo");
        System.out.println(world);
        world=generics.doSomething("method with genericcs");
        System.out.println(world);
    }
}
