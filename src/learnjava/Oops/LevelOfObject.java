package learnjava.Oops;

public class LevelOfObject {
    int level;

    public static void main(String[] args) {
        LevelOfObject l=new LevelOfObject();
        l.level=7;
        l.changeLevel();
        LevelOfObject lCopy=l;
        lCopy.level=12;
        System.out.println(l.level);
        System.out.println(lCopy.level);
    }

    private void changeLevel() {
        this.level=9;
    }
}
