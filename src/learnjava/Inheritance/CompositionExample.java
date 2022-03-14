package learnjava.Inheritance;

import learnjava.ComparatorsAndFilterAndString.Person;

public class CompositionExample {
    public static void main(String[] args) {
        new PersonDetails(new Brain(), new Hand());
    }

    static class PersonDetails {
        Brain brain;
        Hand hand;

        public PersonDetails(Brain brain, Hand hand) {
            this.brain = brain;
            this.hand = hand;
        }
    }
}

class Brain {
}

class Hand {
}
