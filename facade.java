
//Structural patterns
//      deal with object structuring and relationships between entities.

//Goal of facade
//      to Provide a unified interface to a set of interfaces in a subsystem.
//      Facade defines a higher-level interface that makes the subsystem easier to use.

public class facade {
    interface Animal{
        void travel();
    }
    //subclass
    static class Dog implements Animal{
        public void travel() {
            System.out.println("Dog runs");
        }
    }
    static class Eagle implements Animal{
        public void travel() {
            System.out.println("Eagle flies");
        }
    }

    // ZooFacade class
    static class ZooFacade {
        private Dog dog;
        private Eagle eagle;

        public ZooFacade() {
            dog = new Dog();
            eagle = new Eagle();
        }

        public void dogActions() {
            dog.travel();
        }

        public void eagleActions() {
            eagle.travel();
        }
    }

    // Usage
    public static void main(String[] args) {

        //create an instance of the ZooFacade. so this automatically create a dog instance and an eagle instance due to the constructor.
        ZooFacade zooFacade = new ZooFacade();

        zooFacade.dogActions();
        zooFacade.eagleActions();
    }
}
