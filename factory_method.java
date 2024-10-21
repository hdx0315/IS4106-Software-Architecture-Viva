
//Creational patterns deal with object creation, trying to create objects in a manner suitable to the situation.

//The core theory of factory method is
//      to define an interface for creating an object,
//      but let subclasses change the type of objects that will be created.

public class factory_method {

    //VehicleFactory interface to create vehicle objects.
    interface VehicleFactory {
        Vehicle createVehicle();
    }

    //Subclasses----------------------------------------------------------------
    // CarFactory subclass
    static class CarFactory implements VehicleFactory {
        public Vehicle createVehicle() {
            return new Car();
        }
    }

    // BikeFactory subclass
    static class BikeFactory implements VehicleFactory {
        public Vehicle createVehicle() {
            return new Bike();
        }
    }

    // Vehicle interface
    interface Vehicle {
        void travel();
    }

    //subclasses----------------------------------------------------------
    // Car class
    static class Car implements Vehicle {
        public void travel() {
            System.out.println("Car drives");
        }
    }

    // Bike class
    static class Bike implements Vehicle {
        public void travel() {
            System.out.println("Bike rides");
        }
    }

    public static void main(String[] args) {

        //carFactory object for further creation of car object using .
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.travel();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.travel();
    }
}