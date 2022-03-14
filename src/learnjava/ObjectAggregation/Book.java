package learnjava.ObjectAggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String name;
    private String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        List<String> bookDetails = new ArrayList<>();
        Family f = new Family();
        f.Add();
    }


}
class Ajay implements personDetail,BookDetails {

    @Override
    public void Add() {

    }

    @Override
    public String print() {
        return null;
    }
}

interface personDetail {
    void Add();

}

interface BookDetails {
    String print();
}

class Family implements personDetail, BookDetails {

    @Override
    public void Add() {
        List<String> name = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        name.add(sc.nextLine());
        while (sc.hasNext()) {
            book.setLastname(String.valueOf(name.add(sc.nextLine())));

            System.out.println("book name  " + name);
        }

        System.out.println(name);

    }

    void printBook() {

    }

    @Override
    public String print() {
        Add();
        System.out.println();
        return "Print";
    }
}
