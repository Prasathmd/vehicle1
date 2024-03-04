package vehicle;

public class MotorVehicle {

    int engineCapacity = 100;

    public MotorVehicle() {
        System.out.println("Motor Vehicle Constructor");
    }

    public void startEngine() {
        System.out.println("Motor Vehicle Start engine");
    }

}

class Car extends MotorVehicle {

    Car() {
        super();
        System.out.println("Car constructor");
    }

    Car(String col) {
        System.out.println("inside the Car overloaded contructor");
    }

    public static void main(String[] args) {
        Car carObj = new Car();
        System.out.println("inside the Car main method");
    }

}

class NissanCar extends Car {

    NissanCar() {
        System.out.println("inside the NissanCar constructor");
    }

    NissanCar(String color) {
        // super(color);

        System.out.println("inside the Overloaded Nissan Car constructor color =" + color);
    }

    public static void main(String[] args) {
        NissanCar nissanCarObj = new NissanCar("Red");
        System.out.println("Inside the Nissan Car main method");
        nissanCarObj.startEngine();
        nissanCarObj.engineCapacity = 200;
        System.out.println("engine capacity =" + nissanCarObj.engineCapacity);
    }

}
