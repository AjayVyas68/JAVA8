package learnjava.Inheritance;

public class HeroExecutor {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.usePower();
        Hero batman=new BatMan();
        batman.usePower();
        Hero spiderMan=new SpiderMan();
        spiderMan.usePower();
    }

}
    class  Hero
    {
        void usePower()
        {
            System.out.println(
                    "the Hero Method"
            );
        }
    }
class BatMan extends Hero
{

    @Override
    void usePower() {
        System.out.println("this is Bat man Web Throw");
        }
}
class SpiderMan extends Hero
{
    @Override
    void usePower() {
        System.out.println("this is the SpiderMan");
    }
}
