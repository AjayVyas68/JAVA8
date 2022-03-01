package java_8.ComparatorsAndFilterAndString;

public class Person {
    private final String name;
    private final int age;

    public Person(String theName, int theAge) {
        this.name = theName;
        this.age = theAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int ageDifference(Person other){
        return age-other.age;
    }
    public Person findByName(Person other)
    {
        return (Person) name.chars().sorted();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
