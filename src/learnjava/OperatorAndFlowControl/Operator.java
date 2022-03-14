package learnjava.OperatorAndFlowControl;

public class Operator {
    public void incrementOperator() {
        System.out.println("Post increment");
        int v = 0;
        System.out.println(v);  // output  = 0
        System.out.println(v++);// initialization  = 0 than add 1
        System.out.println(v);  // output  = 1
        System.out.println("Pre increment ");
        int z = 0;
        System.out.println(z); // output  = 0
        System.out.println(++z); // first add 1, output  = 1
        System.out.println(z);      // output  = 1
    }

    public void decrementOperator() {
        System.out.println("Post decrement");
        int v = 0;
        System.out.println(v);  // output  = 0
        System.out.println(v--);// initialization  = 0 than subtract - 1
        System.out.println(v);  // output  = 1
        System.out.println("Pre decrement ");
        int z = 0;
        System.out.println(z);   // output  = 0
        System.out.println(--z); // first subtract -1, output  = -1
        System.out.println(z);   // output  = -1
    }

    public static void main(String[] args) {
        new Operator().incrementOperator();
        new Operator().decrementOperator();
        System.out.println((5+5)*5);

    }
}
