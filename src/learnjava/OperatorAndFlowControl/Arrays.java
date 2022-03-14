package learnjava.OperatorAndFlowControl;

public class Arrays {

    public void differentTypeOfArray() {
        int[] abbc = new int[3];
        abbc[0] = 125;
        abbc[1] = 18;
        abbc[2] = 156;
        System.out.println("Direct index " + abbc[0]);
        for (int hello : abbc) {
            System.out.println("loop " + hello);
        }
    }

    public void StringArray() {
        String[] MArio = new String[4];
        MArio[1] = "hello";
        MArio[2] = "world";
        MArio[3] = "sdfdsf";
        for (String store : MArio) {
            System.out.println("String Array =" + store);
        }
    }

    public void ticTacToe() {
        String[][] tictactoeBoard = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                tictactoeBoard[row][column] = row + " ," + column + " | ";
                System.out.print(tictactoeBoard[row][column]);
            }
            System.out.println();
        }
    }

    private void SimpleFood() {
        String[][] simplFood = new String[2][2];
        simplFood[0][0] = "aalo";
        simplFood[1][0] = "Tamatar";
        simplFood[1][1] = "aalo";
        for (int lineindex = 0, columnIndex; lineindex < 2; lineindex++) {
            columnIndex = 0;
            while (lineindex < 2) {
                if (simplFood[lineindex][0] == "Tamatar") {
                    simplFood[lineindex][columnIndex++] = "Helthy";
                } else {
                    simplFood[lineindex][columnIndex] = "junk";
                    break;
                }
            }

        } System.out.println(simplFood[0][0] +" | "+simplFood[0][1]+" | "+simplFood[1][0]+" | "+simplFood[1][1]);
    }

    public static void main(String[] args) {

        new Arrays().differentTypeOfArray();
        new Arrays().StringArray();
        new Arrays().ticTacToe();
        new Arrays().SimpleFood();
    }
}
