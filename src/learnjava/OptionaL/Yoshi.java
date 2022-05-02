package learnjava.OptionaL;

import java.util.Objects;
import java.util.Optional;

public class Yoshi {
    public Integer apples;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yoshi yoshi = (Yoshi) o;
        return Objects.equals(apples, yoshi.apples);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apples);
    }

    public Yoshi(Integer apples) {
        this.apples=apples;
    }
    public Optional<Integer> getEatenApples()
    {
            return Optional.ofNullable(apples);
    }

    public static void main(String[] args) {
        Yoshi yoshi=new Yoshi(7);
        Integer eatApple=Optional.of(yoshi).flatMap(Yoshi::getEatenApples).orElse(0);
        Optional<Optional<Integer>> eattenApple=Optional.of(yoshi).map(Yoshi::getEatenApples);
        System.out.println(eatApple);
    }

}
