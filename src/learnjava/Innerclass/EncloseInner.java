package learnjava.Innerclass;

public class EncloseInner {
    /*
    *       Nested classes represent a special type of relationship that is it can access all the members (data
    members and methods) of outer class including private .
    *       When we want to use the concept of encapsulation effectively, inner classes are crucial to be
    understood. One example where inner classes are vastly used is with the builder pattern
* */
    public static void main(String[] args) {
        EncloseInner e=new EncloseInner();
        e.new Innerclass().print();
    }

    private class Innerclass {
        public void print() {
        new EncloseInner().print();
        }   
    }

    private void print() {
        System.out.println("Text From the Enclosing class");
    }
}
