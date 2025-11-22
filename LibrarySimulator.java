/*
 * https://github.com/Abdulmohsen-99/LibrarySimulation_CSC111
 * [Abdulmohsen Alabdulkaream] ID: 446107134
 * [Rayan Alaseed] ID: 446104338
 * [Abdulelah Alhoshan] ID: 446101982
 */
package LibrarySimulator;

import java.util.Scanner;

public class LibrarySimulator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// create objects
		
		Member m1 = new Member( 101 , "Ali" , 0 );
		Member m2 = new Member( 102 , "Mohammed" , 5 );
		Member m3 = new Member( 103 , "Salman" , 2 );
		
		Member currentMember = null;

			while (true) {

			// main menu
			
				System.out.println("Welcome to The Library Simulator!");
				System.out.println("Please select an option:");
				System.out.println("1. Login as User");
				System.out.println("2. Login as Administrator");
				System.out.println("3. Exit the program");
				System.out.print("Enter your choice (1-3): ");
			
			if (!input.hasNextInt()) {
				input.next();
				System.out.println("Invalid input type. Please enter a number.");
			    continue;
			}
			
			
				int choice = input.nextInt();	
			
			// users menu
			
			if (choice == 1) {
			
				System.out.println("--- User Account Selection ---");
				System.out.println("1. 101: Ali");
				System.out.println("2. 102: Mohammed");
				System.out.println("3. 103: Salman");
				System.out.println("4. Back to Main Menu");
				System.out.print("Choose your user (1-4): ");

			while (!input.hasNextInt()) {
			input.next(); 
				System.out.println("Invalid input type. Please enter a number.");
				System.out.print("Please re-enter your choice (1-4): ");
				}
		
				int userChoice = input.nextInt(); 

			if (userChoice == 1) 
					currentMember = m1; 
				
			else if (userChoice == 2) 
					currentMember = m2; 

			else if (userChoice == 3) 
					 currentMember = m3; 
					
			else 
					 currentMember = null;
				
			if (currentMember != null) {
                    boolean backToMain = false;
                    
                    do {
                    	System.out.println(currentMember.getName() + " Operations Menu : ");
                        System.out.println("1. View Borrowed Books Count");
                        System.out.printf("2. Borrow Book (Fee: %.2f $)\n", Member.BORROW_FEE);
                        System.out.println("3. Return Book (No Fee)");
                        System.out.println("4. View Session Summary");
                        System.out.println("5. Exit to Main Menu");
                        System.out.print("Enter your choice (1-5): ");

                while (!input.hasNextInt()) {
                            input.next();
                            System.out.println("Invalid input.");
                            System.out.print("Re-enter your choice (1-5): ");
                        }
                        
                        int opChoice = input.nextInt();
                        
                        switch (opChoice) {
                        case 1:
                            currentMember.viewBorrowedCount();
                            break;
                        case 2:
                            currentMember.borrowOne();
                            break;
                        case 3:
                            currentMember.returnOne();
                            break;
                        case 4:
                            currentMember.displayStatistics();
                            break;
                        case 5:
                        	System.out.println("--- Ending session for " + currentMember.getName() + " ---");
                        	currentMember.reset();
                            backToMain = true;
                            break;
                            
                        default:
                            System.out.println("Invalid option. Please enter 1-5.");
                        }
                    } while (!backToMain);
				}
			}
			
			// admin menu
			
			else if (choice == 2) {
				
                boolean exitAdmin = false;
                while (!exitAdmin) {
                    	System.out.println("=== Administrator Menu ===");
                    	System.out.println("1. View Total Revenue");
                    	System.out.println("2. Most Frequent Operation");
                    	System.out.println("3. Exit to Main menu");
                    	System.out.print("Enter your choice (1-3): ");
                    while (!input.hasNextInt()) {
        				input.next(); 
        				System.out.println("Invalid input type. Please enter a number.");
        				System.out.print("Please re-enter your choice (1-3): ");
        			}
                    int adminChoice = input.nextInt();
                    if (adminChoice == 1) {
                    	System.out.printf("The Total Revenue is %.2f $\n", Member.TotalRevenue);
                    }
                    else if (adminChoice == 2) {
                    	if (Member.TotalBorrows > Member.TotalReturns) {
                            System.out.println("The Most frequent Operation is Borrow");
                        } else if (Member.TotalBorrows < Member.TotalReturns) {
                            System.out.println("The Most frequent Operation is Return");
                        } else {
                            System.out.println("Both Return and Borrow Operations are equal");
                        }
                    }
                    else if (adminChoice == 3) {
                        exitAdmin = true;
                    } 
                    else {
                        System.out.println("Invalid choice!");
                    	}
                }
			}
			else if (choice == 3) {
                System.out.println("Thank you for using the Library Simulator. Goodbye!");
                break; 
            } else {
                System.out.println("Error: Invalid choice.");
            }
        }
        input.close();
    }
}

