package learnjava.Oops;

public class ArraysChange {
    public static void main(String[] args) {
        String [] homeSweets={"choclate","juice","fruit"};
        changeValue(homeSweets);
        System.out.println(homeSweets[2]);
    }

    private static void changeValue(String[] homeSweets) {
        homeSweets[0]="vegetables";
    }
}
