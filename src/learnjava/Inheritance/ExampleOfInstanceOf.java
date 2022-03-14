package learnjava.Inheritance;

public class ExampleOfInstanceOf {
    public static void main(String[] args) {
        Object xavier = new Xavier();
        System.out.println(new Venom() instanceof Object);
// #1
        System.out.println(xavier instanceof Xavier && xavier instanceof Object);
        System.out.println(new Wolverine() instanceof Heroa);

        System.out.println(new Heroa() instanceof Wolverine);
    }

}
class Xavier{

}
class Venom{

}
class Wolverine extends Heroa{

}
class Heroa{

}
