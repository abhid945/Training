package Week_1.Day7;
/**Write a program in which you will declare an abstract class Vehicle inherits this
class from two classes car and truck using the method engine in both display "car has
good engine" and "truck has bad engine". */
abstract class Vehicle{

    abstract void engine();
}

class Car extends  Vehicle{

    @Override
    void engine() {
        System.out.println("Car has a good Engine");
    }
}


class Truck extends Vehicle{


    @Override
    void engine() {
        System.out.println("Truck has a bad Engine" );
    }
}



public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine();
        Truck truck = new Truck();
        truck.engine();
    }
}
