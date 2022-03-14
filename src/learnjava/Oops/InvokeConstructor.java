package learnjava.Oops;

public class InvokeConstructor {
    private final String vName;
    private final int year;

    public InvokeConstructor (String vName, int year)
    {
        this.vName=vName;
        this.year=year;
    }

    public InvokeConstructor() {
        this("First ",123);
    }

    public void printBat()
    {
        System.out.println("Version Name ="+vName+" And Year ="+year);
    }
    public static void main(String[] args) {
        InvokeConstructor iq=new InvokeConstructor();
        iq.printBat();
        InvokeConstructor in=new InvokeConstructor("Second",456);
        in.printBat();


    }

}
