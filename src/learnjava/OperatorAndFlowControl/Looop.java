package learnjava.OperatorAndFlowControl;

public class Looop {
    void innerLoop() {
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 2; j++) {
                if (j == 2)
                    continue inner;
                if (i >= 3)
                    break inner;
                System.out.println(i + " " + j);
            }

        }
    }

    void doWhile() {
        int d = 99;
        do {
            System.out.println(d++);

        }
        while (d < 10);

        System.out.println("exit");
    }

    public void foreachLoop() {
        int[] fe = {10, 94, 04, 59};
        int i = 0;
        while (i < fe.length) {
            System.out.println("For Each Loop =" + i + " " + fe[i++]);
        }
    }


    public static void main(String[] args) {
        System.out.println("ExampleLoop");
        new Looop().innerLoop();
        System.out.println("do While Loop");
        new Looop().doWhile();
        new Looop().foreachLoop();
        for (int i = 0; i < 10; i++) {
            if (i <= 2) {
                System.out.println("This " + i);
                continue;
            }
        }
    }
}
