package java_8.Oops;

public class WithParaMeter {

    public void print(String msg)
    {
        System.out.println("Hello World "+msg);

    }

    public static void main(String[] args) {
        WithParaMeter withParaMeter=new WithParaMeter();
        withParaMeter.print("Hey ");
    }
}