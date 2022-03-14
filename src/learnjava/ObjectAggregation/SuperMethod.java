package learnjava.ObjectAggregation;

public class SuperMethod {
    public static void main(String[] args) {
        new Homer();
    }

    static class Character{
          Character(String name)
        {
            System.out.println(name.concat(" is walking"));
        }
    }

     static class Homer extends Character{


         Homer()
        {
            super("nira");
        }
    }
}
