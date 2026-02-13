/ Car.java
public class Car extends Vehicle {
    
    // Additional field
    private String fuelType;

    // Constructor
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Call parent constructor
        this.fuelType = fuelType;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent method
        System.out.println("Fuel Type: " + fuelType);
    }
