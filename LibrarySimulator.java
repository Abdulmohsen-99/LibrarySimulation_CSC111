/*
 * [Abdulmohsen Alabdulkaream] ID: 446107134
 * [Rayan Alaseed] ID: 446104338
 * [Abdulelah Alhoshan] ID: 446101982
 */
package LibrarySimulator;

import java.util.Scanner;

public class LibrarySimulator {
	
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	while (true) {
		
		System.out.println("Welcome to The Library Simulator!");
		System.out.println("Please select an option: ");
		System.out.println("1. Login as Ali (ID: 101)");
		System.out.println("2. Login as Mohammed (ID: 102)");
		System.out.println("3. Login as Salman (ID: 103)");
		System.out.println("4. Login as Administrator");
		System.out.println("5. Exit the program");
		System.out.print("Enter your choice (1-5): ");
		
	int choice = input.nextInt();
	
	switch (choice) {
	
	case 1 :
		System.out.println("User Ali selected");
		break;
	case 2 :
		System.out.println("User Mohammed selected");
		break;
	case 3 :
		System.out.println("User Salman selected");
		break;
	case 4 :
		System.out.println("Administrator selected");
		break;
	case 5 :
		System.out.println("Thank you for using the Library Simulator. Goodbye!");
		break;
	default :
		System.out.println("Error: Invalid choice. Please enter a number between 1 and 5.");
			
	}	
	}
}
}

