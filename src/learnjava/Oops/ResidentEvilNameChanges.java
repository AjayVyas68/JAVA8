package learnjava.Oops;

public class ResidentEvilNameChanges {
    private String name = "Nemesis";

    ResidentEvilNameChanges(String name) {
        name = name;
    }

    private void changeName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ResidentEvilNameChanges r = new ResidentEvilNameChanges("Leon");
        System.out.println(r.name);
        r.changeName(r.name);
        System.out.println(r.name);
    }
}
