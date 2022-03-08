package java_8.Oops;

public class ResidentEvilNameChanges {
    private String name="Nemesis";
    ResidentEvilNameChanges(String name)
    {
        name=name;
    }

    public static void main(String[] args) {
        ResidentEvilNameChanges r=new ResidentEvilNameChanges("Leon");
        System.out.println(r.name);
//        r.changgeName(r.name);
//        System.out.println(r.name);
    }

    private void changgeName(String name) {
        this.name=name;
    }
}
