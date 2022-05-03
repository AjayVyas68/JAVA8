package learnjava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifible {
    private static List<String> data=new ArrayList<>();

    public static void main(String[] args) {
        data.add("pm");
        data.add("cm");
        data =getUnmodifiblle();
        data.add("lodu");
    }

    private static List<String> getUnmodifiblle() {
        Collections.unmodifiableList(data);
        return null;
    }
}
