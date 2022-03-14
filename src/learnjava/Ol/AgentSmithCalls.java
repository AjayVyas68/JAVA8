package learnjava.Ol;

public class AgentSmithCalls {
    public static void main(String[] args) {
        createClone(12,56,48,95,152,65);
    }

    static void createClone(int... agent) {
        for (int Agent : agent) {
            System.out.println(Agent);
        }
    }
}
