/*
 * [Abdulmohsen Alabdulkaream] ID: 446107134
 * [Rayan Alaseed] ID: 446104338
 * [Abdulelah Alhoshan] ID: 446101982
 */
package LibrarySimulator;

import java.util.Scanner;

public class LibrarySimulator {
 //constant&varibals
	final static String NAME_1 = "Ali";
    final static int ID_1 = 101;
    static int booksBorrowed_1 = 0; 
    
    final static String NAME_2 = "Mohammed";
    final static int ID_2 = 102;
    static int booksBorrowed_2 = 5; 
    
    final static String NAME_3 = "Salman";
    final static int ID_3 = 103;
    static int booksBorrowed_3 = 2;

    static double totalRevenue = 0.00;
    static int totalBorrows = 0;
    static int totalReturns = 0;
    
    final static int MAX_BOOKS = 5;
    final static double BORROW_FEE = 0.50;
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
	// users menu
			if (choice == 1) {
				System.out.println("--- User Account Selection ---");
                System.out.println("1. " + ID_1 + ": " + NAME_1);
                System.out.println("2. " + ID_2 + ": " + NAME_2);
                System.out.println("3. " + ID_3 + ": " + NAME_3);
                System.out.println("4. Back to Main Menu");
                System.out.print("Choose your user (1-4): ");
                
                while (!input.hasNextInt()) {
                    input.next(); 
                    System.out.println("Invalid input type. Please enter a number.");
                    System.out.print("Please re-enter your choice (1-4): ");
                }
                choice = input.nextInt(); 
                
                if (choice == 1) {
                    
                    int sessionBorrows = 0;
                    int sessionReturns = 0;
                    double sessionFees = 0.0;
                    boolean backToMain = false;

                    do {
                        System.out.println("--- Ali (" + ID_1 + ") Operations Menu ---");
                        System.out.println("1. View Borrowed Books Count");
                        System.out.println("2. Borrow Book (Fee: " + String.format("%.2f", BORROW_FEE) + " $)");
                        System.out.println("3. Return Book (No Fee)");
                        System.out.println("4. View Session Summary");
                        System.out.println("5. Exit to Main Menu");
                        System.out.print("Enter your choice (1-5): ");
                        
                        while (!input.hasNextInt()) {
                            input.next();
                            System.out.println("Invalid input type. Please enter a number.");
                            System.out.print("Please re-enter your choice (1-5): ");
                        }
                        choice = input.nextInt(); 
                        
                        switch (choice) {
                            case 1:
                                System.out.println("--- Current Books Borrowed: " + booksBorrowed_1 + " ---");
                                break;
                                
                            case 2:
                                if (booksBorrowed_1 < MAX_BOOKS) {
                                    booksBorrowed_1++;
                                    sessionBorrows++;
                                    sessionFees += BORROW_FEE;
                                    totalRevenue += BORROW_FEE; 
                                    totalBorrows++; 
                                    System.out.println("SUCCESS: You borrowed one book.");
                                    System.out.println("Current books: " + booksBorrowed_1);
                                } else {
                                    System.out.println("ERROR: Cannot borrow! You have reached the maximum limit of " + MAX_BOOKS + " books.");
                                }
                                break;
                                
                            case 3:
                                if (booksBorrowed_1 > 0) {
                                    booksBorrowed_1--;
                                    sessionReturns++;
                                    totalReturns++; 
                                    System.out.println("SUCCESS: You returned one book. (No fee)");
                                    System.out.println("Current books: " + booksBorrowed_1);
                                } else {
                                    System.out.println("ERROR: Cannot return! You have no books borrowed.");
                                }
                                break;
                                
                            case 4:
                                System.out.println("--- Session Activity Summary ---");
                                System.out.println("Number of books borrowed (this session):\t" + sessionBorrows);
                                System.out.println("Number of books returned (this session):\t" + sessionReturns);
                                System.out.println("Total fees incurred (this session):\t" + String.format("%.2f", sessionFees) + " $");
                                break;
                                
                            case 5:
                                System.out.println("--- Ending session for " + NAME_1 + " ---");
                                backToMain = true; 
                                break;
                                
                            default:
                                System.out.println("Invalid option. Please enter a number from 1 to 5.");
                        }
                    } while (!backToMain); 

                } else if (choice == 2) {
                    
                    int sessionBorrows = 0;
                    int sessionReturns = 0;
                    double sessionFees = 0.0;
                    boolean backToMain = false;

                    do {
                        System.out.println("--- Mohammed (" + ID_2 + ") Operations Menu ---");
                        System.out.println("1. View Borrowed Books Count");
                        System.out.println("2. Borrow Book (Fee: " + String.format("%.2f", BORROW_FEE) + " $)");
                        System.out.println("3. Return Book (No Fee)");
                        System.out.println("4. View Session Summary");
                        System.out.println("5. Exit to Main Menu");
                        System.out.print("Enter your choice (1-5): ");
                        
                        while (!input.hasNextInt()) {
                            input.next();
                            System.out.println("Invalid input type. Please enter a number.");
                            System.out.print("Please re-enter your choice (1-5): ");
                        }
                        choice = input.nextInt();
                        
                        switch (choice) {
                            case 1:
                                System.out.println("--- Current Books Borrowed: " + booksBorrowed_2 + " ---");
                                break;
                                
                            case 2:
                                if (booksBorrowed_2 < MAX_BOOKS) {
                                    booksBorrowed_2++;
                                    sessionBorrows++;
                                    sessionFees += BORROW_FEE;
                                    totalRevenue += BORROW_FEE;
                                    totalBorrows++;
                                    System.out.println("SUCCESS: You borrowed one book.");
                                    System.out.println("Current books: " + booksBorrowed_2);
                                } else {
                                    System.out.println("ERROR: Cannot borrow! You have reached the maximum limit of " + MAX_BOOKS + " books.");
                                }
                                break;
                                
                            case 3:
                                if (booksBorrowed_2 > 0) {
                                    booksBorrowed_2--;
                                    sessionReturns++;
                                    totalReturns++;
                                    System.out.println("SUCCESS: You returned one book. (No fee)");
                                    System.out.println("Current books: " + booksBorrowed_2);
                                } else {
                                    System.out.println("ERROR: Cannot return! You have no books borrowed.");
                                }
                                break;
                                
                            case 4:
                                System.out.println("--- Session Activity Summary ---");
                                System.out.println("Number of books borrowed (this session):\t" + sessionBorrows);
                                System.out.println("Number of books returned (this session):\t" + sessionReturns);
                                System.out.println("Total fees incurred (this session):\t" + String.format("%.2f", sessionFees) + " $");
                                break;
                                
                            case 5:
                                System.out.println("--- Ending session for " + NAME_2 + " ---");
                                backToMain = true; 
                                break;
                                
                            default:
                                System.out.println("Invalid option. Please enter a number from 1 to 5.");
                        }
                    } while (!backToMain); 

                } else if (choice == 3) {
                    
                    int sessionBorrows = 0;
                    int sessionReturns = 0;
                    double sessionFees = 0.0;
                    boolean backToMain = false;

                    do {
                        System.out.println("--- Salman (" + ID_3 + ") Operations Menu ---");
                        System.out.println("1. View Borrowed Books Count");
                        System.out.println("2. Borrow Book (Fee: " + String.format("%.2f", BORROW_FEE) + " $)");
                        System.out.println("3. Return Book (No Fee)");
                        System.out.println("4. View Session Summary");
                        System.out.println("5. Exit to Main Menu");
                        System.out.print("Enter your choice (1-5): ");
                        
                        while (!input.hasNextInt()) {
                            input.next();
                            System.out.println("Invalid input type. Please enter a number.");
                            System.out.print("Please re-enter your choice (1-5): ");
                        }
                        choice = input.nextInt();
                        
                        switch (choice) {
                            case 1:
                                System.out.println("--- Current Books Borrowed: " + booksBorrowed_3 + " ---");
                                break;
                                
                            case 2:
                                if (booksBorrowed_3 < MAX_BOOKS) {
                                    booksBorrowed_3++;
                                    sessionBorrows++;
                                    sessionFees += BORROW_FEE;
                                    totalRevenue += BORROW_FEE;
                                    totalBorrows++;
                                    System.out.println("SUCCESS: You borrowed one book.");
                                    System.out.println("Current books: " + booksBorrowed_3);
                                } else {
                                    System.out.println("ERROR: Cannot borrow! You have reached the maximum limit of " + MAX_BOOKS + " books.");
                                }
                                break;
                                
                            case 3:
                                if (booksBorrowed_3 > 0) {
                                    booksBorrowed_3--;
                                    sessionReturns++;
                                    totalReturns++;
                                    System.out.println("SUCCESS: You returned one book. (No fee)");
                                    System.out.println("Current books: " + booksBorrowed_3);
                                } else {
                                    System.out.println("ERROR: Cannot return! You have no books borrowed.");
                                }
                                break;
                                
                            case 4:
                                System.out.println("--- Session Activity Summary ---");
                                System.out.println("Number of books borrowed (this session):\t" + sessionBorrows);
                                System.out.println("Number of books returned (this session):\t" + sessionReturns);
                                System.out.println("Total fees incurred (this session):\t" + String.format("%.2f", sessionFees) + " $");
                                break;
                                
                            case 5:
                                System.out.println("--- Ending session for " + NAME_3 + " ---");
                                backToMain = true; 
                                break;
                                
                            default:
                                System.out.println("Invalid option. Please enter a number from 1 to 5.");
                        }
                    } while (!backToMain);

                } else if (choice == 4) {
                    System.out.println("--- Returning to Main Menu ---");
                } else {
                    System.out.println("Invalid user selection. Returning to Main Menu");
                }
                
            

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
						if(totalBorrows > totalReturns) {
							System.out.println("The Most frequent Operation is borrow");
						} 

						else if(totalBorrows < totalReturns) {
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





