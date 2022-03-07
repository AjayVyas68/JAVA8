package java_8.Oops;

public class AnimalInnvocation {
        String name;
        String color;
        public void animalColor()
        {
            System.out.println(color);
        }
        public void animalName()
        {
            System.out.println(name);
        }
    public static void main(String[] args) {
        AnimalInnvocation animalInnvocation=new AnimalInnvocation();
        animalInnvocation.color="black";
        animalInnvocation.name="Peacock";
        animalInnvocation.animalColor();
        animalInnvocation.animalName();

    }
}
