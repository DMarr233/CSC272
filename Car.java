// Car class (superclass)
public class Car {
    // Class variables (or fields)
    String make;
    String model;

    public String getSound() {
        return "Beep beep!";
    }

    int year;

    // Constructor method
    public Car(String carMake, String carModel, int carYear) {
        // Initializing object properties
        make = carMake;
        model = carModel;
        year = carYear;
    }

    // Method to display car details
    public void display() {
        System.out.println("Car details: " + year + " " + make + " " + model);
    }

    // Method to start the car
    public void start() {
        System.out.println("Starting the " + make + " " + model);
        System.out.println(getSound());
    }
}

// Subclass of Car: ElectricCar
class ElectricCar extends Car {
    // Additional subclass-specific variables
    @Override
    public String getSound() {
        return "*Spaceship noises*";
    }

    int batteryCapacity; // in kWh

    // Constructor for ElectricCar
    public ElectricCar(String carMake, String carModel, int carYear, int batteryCapacity) {
        // Calling superclass constructor using super()
        super(carMake, carModel, carYear);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding display() method of superclass
    @Override
    public void display() {
        // Customized display for ElectricCar
        System.out.println("Electric Car details: " + year + " " + make + " " + model + " " + ", Battery Capacity: "
                + batteryCapacity + " kWh");
    }

    // Method specific to ElectricCar
    public void charge() {
        System.out.println("Charging the " + make + " " + model);
        System.out.println("Battery fully charged!");
    }
}

// Subclass of Car: SportsCar
class SportsCar extends Car {
    // Additional subclass-specific variables
    @Override
    public String getSound() {
        return "Vroooom";
    }

    int maxSpeed; // in km/h

    // Constructor for SportsCar
    public SportsCar(String carMake, String carModel, int carYear, int maxSpeed) {
        // Calling superclass constructor using super()
        super(carMake, carModel, carYear);
        this.maxSpeed = maxSpeed;
    }

    // Method specific to SportsCar
    public void displaySpeed() {
        System.out.println("Max speed of " + year + " " + make + " " + model + " is " + maxSpeed + " km/h");

    }
}
