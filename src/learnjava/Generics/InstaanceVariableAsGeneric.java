package learnjava.Generics;

public class InstaanceVariableAsGeneric<T> {
    T t;

    public InstaanceVariableAsGeneric(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        InstaanceVariableAsGeneric<String> i=new InstaanceVariableAsGeneric<>("vijay");
        String s=i.t;
        System.out.println(s);
    }
}
