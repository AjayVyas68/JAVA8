package learnjava.OBjec;

import java.util.List;
import java.util.Objects;

public class SpiderMan {
    static int equalscount = 0;

    public static void main(String[] args) {
        System.out.println(areEquals(new spiderMan("ajay"), new spiderMan("ajay")));
        spiderMan s = new spiderMan("vijay") {
            public int hashcode() {
                return 44 + 777 + 1;
            }
        };
        System.out.println(areEquals(s,new spiderMan("vijay")));
        System.out.println(equalscount);

    }

    static boolean areEquals(spiderMan sp1, spiderMan sp2) {
        return sp1.hashCode() == sp2.hashCode() &&
                sp1.equals(sp2);
    }

    static class spiderMan {
        String name;

        spiderMan(String name) {
            this.name = name;
        }

        public boolean equals(Object b) {
            final Object spiderman = (spiderMan) b;
            equalscount++;
            return name.equals(((spiderMan) spiderman).name);
        }

        public int hashcode() {
            return 43 + 777;
        }
    }

}
