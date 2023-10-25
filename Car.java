public class Car extends Vehicle {
    private String carType;

    public Car(String name, int year, String type) {
        super(name, year); // Call the base class constructor to set name and year
        this.carType = type;
    }

    @Override
    public void start() {
        super.start(); // Call the base class method to display vehicle info
        System.out.println("Car Type: " + carType);
    }

    public static void main(String[] args) {
        Car car = new Car("MyCar", 2023, "Sedan");
        car.start();
    }
}
