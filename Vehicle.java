public class Vehicle {
    String vehicleName;

    Vehicle(String name) {
        this.vehicleName = name;
    }

    void start() {
        System.out.println("Vehicle " + vehicleName + " is starting.");
    }
}
