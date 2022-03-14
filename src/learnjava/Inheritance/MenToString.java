package learnjava.Inheritance;

public class MenToString {
    private String name;
    private String city;

    public MenToString(String name, String city) {

        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {
        MenToString menToString = new
                MenToString("nirav", "navagam");
        System.out.println(menToString);
    }

    @Override
    public String toString() {
        return "name is ".concat(this.name).concat("        And Village Name is  ")  + city  ;
    }
}
