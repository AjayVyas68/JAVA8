package learnjava.Generics;

public class UpperLoWerBoundGenerics {
    interface Betman {
    }

    interface SpiderMan extends Betman {
    }

    interface Anman extends SpiderMan {
    }

    static class Warrior<T> {

    }

    public static void main(String[] args) {
        Warrior<SpiderMan> k = new Warrior<>();
        Warrior<Betman> W = new Warrior<>();
        Warrior<Anman> a = new Warrior<>();
        fight(a,new Warrior<>());
        System.out.println("everything Want to do");

    }

    static void fight(Warrior<? extends Betman> warrior, Warrior<? super SpiderMan> warrior1) {

    }

}
