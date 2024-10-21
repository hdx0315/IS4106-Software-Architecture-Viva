
//Behavioral patterns are concerned with
//      communication between objects, focusing on how objects interact and distribute responsibility.


//The goal of  strategy design pattern is
//      to Define a family of algorithms and encapsulate each one making them interchangeable.
//      this makes the algorithm to vary independently from the instanses that use it.

public class strategy {
    // interface for strategies.. (behaviours of animals.)
    interface Behavior {
        void execute();
    }

    // using strategy interface, create different behaviours and encapsulate them using subclasses.
    static class BarkBehavior implements Behavior {
        public void execute() {
            System.out.println("Dog barks");
        }
    }

    static class FlyBehavior implements Behavior {
        public void execute() {
            System.out.println("Eagle flies");
        }
    }

    // encapsulate all data using an Animal class which use set methods to set data
    static class Animal {
        private Behavior behavior;

        public void setBehavior(Behavior behavior) {
            this.behavior = behavior;
        }

        public void performBehavior() {
            behavior.execute();
        }
    }


    public static void main(String[] args) {
        //create animal instance
        Animal animal = new Animal();

        //set animal's behaviour to bark behaviour.
        animal.setBehavior(new BarkBehavior());
        animal.performBehavior(); // Dog barks

        //set behaviour to fly behaviour
        animal.setBehavior(new FlyBehavior());
        animal.performBehavior(); // Parrot eats

        //performBehavior() method can be used interchangeably..
    }
}
