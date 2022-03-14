package learnjava.Inheritance;

import java.util.Objects;

public class VillageTest {
    private  String name;
    VillageTest(String name)
    {
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(VillageTest.class);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        System.out.println(new VillageTest("word").equals("word"));
        System.out.println(new VillageTest("word").equals(new VillageTest("word")));
    }
}
