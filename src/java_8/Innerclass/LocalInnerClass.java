package java_8.Innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        new LocalInnerClass().print();
    }

    private void print() {
        class LocalClass
        {
            void customPrint()
            {
                System.out.println("CustomiZed Print");
            }
        }
        new LocalClass().customPrint();
    }
}
