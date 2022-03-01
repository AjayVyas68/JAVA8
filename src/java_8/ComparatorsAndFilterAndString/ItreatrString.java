package java_8.ComparatorsAndFilterAndString;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ItreatrString {
    public static void main(String[] args) throws IOException, InterruptedException {
        Mapping.print();
        Mapping.Data();
        Mapping.Compare();
        Mapping.AddFiles();
        Mapping.name();
        Mapping.watchIngFile();


        final String str = "w00t";
        str.chars().filter(ch -> Character.isDigit(ch))
                .forEach(ch -> System.out.println(ch));
        List<Person> Data = Arrays.asList(
                new Person("ajay ", 20),
                new Person("jay ", 34),
                new Person("ay ", 36),
                new Person("Vijay ", 25)
        );
        Data.stream().min(Person::ageDifference).ifPresent(you -> System.out.println("Local Data =" + you));

        /*System.out.println("find Ajay = "+Data.stream().filter(name->name.getName().startsWith("ajay")&&name.getAge()>26)
                .map(name->name.getName()).collect(Collectors.toList()));*/
        List<Person> output =
                Data.stream()
                        .filter(person -> person.getAge() > 25)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println("people More Than Age up 20 => " + output);

        printPeople(" Sorting", Data.stream().
                sorted(Comparator.comparing(Person::getName))
                .collect(toList()));

    }

    private static void printPeople(String msg, List<Person> people) {
        System.out.println(msg);
        people.forEach(System.out::println);
    }


}

class Mapping {
    static List<Person> Data = Arrays.asList(
            new Person("ajay ", 20),
            new Person("jay ", 34),
            new Person("ay ", 36),
            new Person("Vijay ", 25)
    );

    public static void print() {
        Map<String, List<Person>> peopleByName = Data.stream().collect(groupingBy(Person::getName));
        System.out.println("grouped By" + peopleByName);
    }

    public static void Data() {
        Map<Integer, List<String>> PeopleData = Data.stream().collect(
                groupingBy(Person::getAge, mapping(Person::getName, toList()))
        );
        System.out.println("people Are People Data" + PeopleData);
        System.out.println("done");
    }

    public static void Compare() throws IOException {
        Comparator<Person> ByAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> ByOldest = Data.stream().collect(groupingBy(person -> person.getName().charAt(0),
                reducing(BinaryOperator.maxBy(ByAge))));
        System.out.println("oldest Data ->" + ByOldest);
        Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
    }

    public static void AddFiles() {
        final String[] files = new File("out").list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(".java");
            }
        });
        System.out.println("Files New  " + files);
    }

    public static void name() throws IOException {
//        Files.newDirectoryStream(Paths.get("IdeaProjects/java_8"),path->path.toString()
//                .endsWith(".java")).forEach(System.out::println);
        List<File> files = Stream.of(new File(".").listFiles()).flatMap(file -> file.listFiles() == null ?
                Stream.of(file) : Stream.of(file.listFiles())).collect(toList());
        System.out.println("size of Files =" + files);
    }

    public static void watchIngFile() throws IOException, InterruptedException {
        final Path path = Paths.get(".");
        final WatchService watchService = path.getFileSystem().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        System.out.println("Report Any File Changed within next 1 minute");
        final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);
        if (watchKey != null) {
            watchKey.pollEvents().stream().forEach(watchEvent -> System.out.println(watchEvent.context()));
        }
    }


}