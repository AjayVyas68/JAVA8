package learnjava.Ol;

public class NeoOverLoading {
    public static void main(String[] args) {
        NeoOverLoading neoOverLoading=new NeoOverLoading();
        neoOverLoading.learnABility("C",101);
        neoOverLoading.learnABility("Java",102);
        neoOverLoading.learnABility("python",105,"easy");
        neoOverLoading.learnABility("R",104,"hard");

    }

     void learnABility(String c, int i, String aSwitch) {
        System.out.printf("Language is %s and %s topic %s \n",c,i,aSwitch);
    }

     String learnABility(String c, int i) {
        System.out.printf("Language is %s and %s \n",c,i);
         return c;
     }
}
