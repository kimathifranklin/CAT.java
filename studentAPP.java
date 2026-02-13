StudentApp.java
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        // Create StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display student information
        System.out.println("\nStudent Details:");
        student.displayInfo();

        input.close();
    }
}
