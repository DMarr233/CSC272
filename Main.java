public class Main {
    public static void main(String[] args) {
        // Creating objects of Car and its subclasses

        // Create a regular Car object
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.display(); // Car details: Toyota Camry 2020
        myCar.start(); // Starting the Toyota Camry

        // Create an ElectricCar object
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2022, 100);
        tesla.display(); // Electric Car details: Tesla Model S 2022, Battery Capacity: 100 kWh
        tesla.charge(); // Charging the Tesla Model S
        tesla.start(); // Starting the Tesla Model S

        // Create a SportsCar object
        SportsCar ferrari = new SportsCar("Ferrari", "488 GTB", 2021, 330);
        ferrari.display(); // Car details: Ferrari 488 GTB 2021
        ferrari.displaySpeed(); // Max speed of Ferrari 488 GTB is 330 km/h
        ferrari.start(); // Starting the Ferrari 488 GTB
    }
}