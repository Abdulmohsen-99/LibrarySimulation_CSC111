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
		System.out.println("Please select an option:");
		System.out.println("1. Login as User");
		System.out.println("2. Login as Administrator");
		System.out.println("3. Exit the program");
		System.out.print("Enter your choice (1-3): ");
		
	int choice = input.nextInt();
	
    if (choice == 1) {
    // ريان يضيف اسماء المستخدمين و اي دي كل واحد فيهم تحت الاف ذي داخل القوسين	
    	
	}
    
    else if (choice == 2) {
    	
    	System.out.println("Administrator selected.");
    }
   
    else if (choice == 3) {
    	
    	System.out.println("Thank you for using the Library Simulator. Goodbye!");
    }
    
    else {
    	
    	System.out.println("Error: Invalid choice. Please enter a number between 1 and 3.");
    }
}
}
}

