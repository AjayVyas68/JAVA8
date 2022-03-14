package learnjava.Innerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        /*
                 As you can see, we don’t need to create an instance from the EnclosingStaticInnerClass ,
            we just need to reference the enclosing class to access the StaticInnerClass
         */
        stateMachine s = new StaticInnerClass.stateMachine();
        s.print();

    }

    static class stateMachine {
        //Reinforcing that we can access private methods since it’s an inner class
        private void print() {
            System.out.println("hello World");
        }

    }
}
