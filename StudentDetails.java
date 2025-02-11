import java.util.Scanner;

public class StudentDetails {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Fixed System.In to System.in
		
		String name, address, course;
		int yearLevel = 0;  // Initialize to avoid issues
		String contactNumber, usnNumber;
		
        // Input for Name
        System.out.print("Name: ");
        name = scanner.nextLine(); // Fixed nextline() to nextLine()
        
        // Input for Year Level with error handling for non-integer input
        while (true) {
            try {
                System.out.print("Year Level: ");
                yearLevel = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                break;  // Exit the loop if valid input is entered
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer for the Year Level.");
                scanner.nextLine(); // Clear the invalid input from the buffer
            }
        }

        // Input for Address
        System.out.print("Address: ");
        address = scanner.nextLine(); // Fixed nextline() to nextLine()

        // Input for Contact Number
        System.out.print("Contact Number: ");
        contactNumber = scanner.nextLine(); // Fixed nextline() to nextLine()

        // Input for USN
        System.out.print("USN: ");
        usnNumber = scanner.nextLine(); // Fixed nextline() to nextLine()

        // Input for Course
        System.out.print("Course: ");
        course = scanner.nextLine(); // Fixed nextline() to nextLine()

        // Output the details
        System.out.println("--Student Details ---");
		System.out.println("Name: " + name);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Course: " + course);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("USN: " + usnNumber);

        scanner.close(); // Close the scanner
    }
}
