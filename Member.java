/*
 * https://github.com/Abdulmohsen-99/LibrarySimulation_CSC111
 * [Abdulmohsen Alabdulkaream] ID: 446107134
 * [Rayan Alaseed] ID: 446104338
 * [Abdulelah Alhoshan] ID: 446101982
 */
public class Member {

    private int id;
    private String name;
    private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;
    
    // define constants
    public static final int MAX_BOOKS = 5;
    public static final double BORROW_FEE = 0.50;

    // static totals
    public static double TotalRevenue = 0;
    public static int TotalViewBorrowed = 0;
    public static int TotalBorrows = 0;
    public static int TotalReturns = 0;

    // default constructor
    public Member() {
        id = 0;
        name = "";
        borrowedCount = 0;
    }

    // main constructor
    public Member(int id, String name, int borrowedCount) {
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
    }
    public String getName() {
        return name;
    }

    // check borrow
    private boolean canBorrow() {
        return borrowedCount < MAX_BOOKS;
    }

    // check return
    private boolean canReturn() {
        return borrowedCount > 0;
    }

    // show count
    public void viewBorrowedCount() {
        numViewBorrowed++;
        TotalViewBorrowed++;
        System.out.println("Current books borrowed: " + borrowedCount);
    }

    // borrow
    public boolean borrowOne() {
        if (canBorrow()) {
            borrowedCount++;
            numBorrows++;
            TotalBorrows++;
            sessionFees += BORROW_FEE;
            TotalRevenue += BORROW_FEE;
            System.out.println("SUCCESS: Borrowed.");
            return true;
        }
        System.out.println("ERROR: Cannot borrow. Max is " + MAX_BOOKS );
        return false;
    }

    // return
    public boolean returnOne() {
        if (canReturn()) {
            borrowedCount--;
            numReturns++;
            TotalReturns++;
            System.out.println("SUCCESS: Returned.");
            return true;
        }
        System.out.println("ERROR: Nothing to return.");
        return false;
    }

    // stats
    public void displayStatistics() {
        System.out.println("--- Session Summary ---");
        System.out.println("Viewed: " + numViewBorrowed);
        System.out.println("Borrowed: " + numBorrows);
        System.out.println("Returned: " + numReturns);
        System.out.printf("Fees: %.2f\n", sessionFees);
    }

    // reset session
    public void reset() {
        numViewBorrowed = 0;
        numBorrows = 0;
        numReturns = 0;
        sessionFees = 0;
    }
}
