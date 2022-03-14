package learnjava.Inheritance;

import java.util.jar.JarEntry;

public class PrivateModifierInheritance {
    public static void main(String[] args) {
        joker n=new joker();
        n.doTrick();
        villan v=new villan();
        n.add();
    }
}
interface  bookdetails{
    void add();
}

class villan  extends PrivateModifierInheritance implements bookdetails{
     int age =10;
     private void attack()
    {

    }

    @Override
    public void add() {

    }
}
class joker extends villan
{
    void doTrick(){
        villan v=new villan();

        
        System.out.println(age);
    }
}