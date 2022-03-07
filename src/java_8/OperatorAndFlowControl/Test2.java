package java_8.OperatorAndFlowControl;

public class Test2 {
    public static void main(String[] args) {
        int formulaNumber = 10;
        String heisenbergFormula = "World";
        System.out.println("Hello "+heisenbergFormula);
            switch (formulaNumber) {
                case 1:
                    heisenbergFormula += "H";
                case 10:
                    heisenbergFormula += "Ne";
                case 30:
                    heisenbergFormula = heisenbergFormula+"Zn";
                case 25:
                    heisenbergFormula += "Mn";
                    break;

                default:
                    heisenbergFormula +="He";
        }
        System.out.println(heisenbergFormula);

    }
}
