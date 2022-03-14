package learnjava.Innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        /*
            We are instantiating the AnonymousInnerClass object and then opening brackets to specify
        we are creating an anonymous inner class
        */
        new AnonymousInnerClass() {
            //  Then we are creating the printSomethingElse method in this anonymous inner class
            private void printSomethingElse() {
                System.out.println("printing from a anonymous class");
            }
        }.printSomethingElse();
//        Finally, we are invoking the printSomethingElse() method and then it will print: “Printing
//from the anonymous Inner class”.
    }

    private void print() {
        System.out.println("print Something");
    }
}
