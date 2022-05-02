package learnjava.Generics;

public class GenericasChallenge<T> {
    T t;

    public GenericasChallenge(T t) {
        this.t = t;
    }
    public <K> K mystiqeTransform(K k)
    {
        return k;
    }
    public <T> T mysitqueAttack(T t)
    {
        return t;
    }

    public static void main(String[] args) {
        GenericasChallenge<String> g=new GenericasChallenge<>("ajay");
        String realName= g.t;
         String trasnform=g.mystiqeTransform("spiderMan");
        Integer attack= g.mysitqueAttack(1);
        System.out.printf("%s %s %s",trasnform,attack,realName);
    }
}
