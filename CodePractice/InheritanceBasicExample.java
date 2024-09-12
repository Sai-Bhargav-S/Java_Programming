class Engine{

    Engine(){
        System.out.println("In Engine Constructor");
    }
    public void start(){
        System.out.println("Engine Started..!");
    }
}

class Car extends Engine{

    Car(){
        System.out.println("Car's Constructor");
    }
    public void drive(){
        System.out.println("Driving mode..!");
    }
}

//Multi-level Inheritance
class Bike extends Car{
    Bike(){
        System.out.println("Bike's Constructor");
    }
    public void wheels(){
        System.out.println("Two Wheels..!");
    }
}

//Hierarchy Inheritance
class Truck extends Engine{
    Truck(){
        System.out.println("Truck's Constructor");
    }

    public void wheels(){
        System.out.println("Four Wheels..!");
    }

}

public class InheritanceBasicExample {

    public static void main(String[] args) {
        
        Engine engine=new Engine();
        engine.start();

        Car car=new Car();
        car.drive();
        car.start();

        Bike bike =new Bike();
        bike.start();
        bike.drive();
        bike.wheels();

        Truck truck=new Truck();
        truck.wheels();
        truck.start();

    }
    
}
