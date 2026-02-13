// Showroom.java
import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Model: ");
        String model = input.nextLine();

        System.out.print("Enter Year: ");
        int year = input.nextInt();
        input.nextLine();  // Consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = input.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car.displayDetails();

        input.close();
    }
}


}
