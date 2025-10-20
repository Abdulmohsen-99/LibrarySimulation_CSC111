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
			double totalRevenue=2.5;
			int totalBorrow=3;
			int totalReturn=2;		
			if (choice == 1) {
				// ريان يضيف اسماء المستخدمين و اي دي كل واحد فيهم تحت الاف ذي داخل القوسين	

			}
			//Administratot Menu
			else if (choice == 2) {
				boolean exitAdmin= false;
				while(!exitAdmin) {
					System.out.println("\n=== Administrator Menu ===");
					System.out.println("1. View Total Revenue  ");
					System.out.println("2. Most Frequnet Operation  ");
					System.out.println("3. Exit to Main menu  ");
					System.out.println("Enter your choice (1-3): ");
					int AdminChoice =input.nextInt();
					if(AdminChoice==1) {                                          //to view Total Revenue
						System.out.printf("The Total Revenue is %.2f SAR ",totalRevenue);
					}
					else if(AdminChoice==2) {                      //to compare operations
						if(totalBorrow > totalReturn) {
							System.out.println("The Most frequent Operation is borrow");
						} 

						else if(totalBorrow < totalReturn) {
							System.out.println("The Most frequent Operation is Return");
						} 
						else {
							System.out.println("Both Return and Borrow Operations are equal");
						}}
					else if(AdminChoice==3) {                     //To end the loop
						exitAdmin = true;
					}
					else {
						System.out.println("Invalid choice! ");		}                  //if administrator input wrong value
				}

			}





			else if (choice == 3) {

				System.out.println("Thank you for using the Library Simulator. Goodbye!");
			}

			else {

				System.out.println("Error: Invalid choice. Please enter a number between 1 and 3.");
			}
		}
	}}

