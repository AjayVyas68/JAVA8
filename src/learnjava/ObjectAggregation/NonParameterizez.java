package learnjava.ObjectAggregation;

public class NonParameterizez  {
   static Object hello;
    public static void main(String[] args) {
        Character a=new Character();
        a.name("sdfdsf");
        NonParameterizez.hello=10;
        System.out.println(NonParameterizez.hello);
        new Moe();
    }
     static  class Character{
        Character(){
            System.out.println("a Character was created ");
        }
        void name(String name){
            System.out.println(name+" was Created");
        }
    }

     static class Moe extends  Character{
    }
}
