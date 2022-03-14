package learnjava.Inheritance;

public class BeerChallenge {
    public static void main(String[] args) {
        Simpson bart = new Bart();
        drinkbeer(new Homer());

        drinkbeer(bart);
        drinkbeer(new Simpson());

    }

    private static void drinkbeer(Simpson bart) {
        bart.drinkbeer(bart);
    }


}

class Homer extends Simpson{
    @Override
    public void drinkbeer(Simpson bart) {
        System.out.println("Homer Drink");
    }
}

class Simpson {
    public void drinkbeer(Simpson bart) {
        System.out.println("A character is Drinking beer");
    }


}

class Bart extends Simpson{
    @Override
    public void drinkbeer(Simpson bart) {
        System.out.println("bart Not Drink");
    }
}
