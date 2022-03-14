package learnjava.Abstacti;

public class Test  extends marvel{
    @Override
    void usepoewer() {
        System.out.println("called usePower");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.usepoewer();
        System.out.println(t.sum(12,10));

    }
}
abstract class Hero{
     abstract void usepoewer();
}
abstract class marvel extends Hero{
    int sum(int a,int b){
        return a+b;
    }

}
