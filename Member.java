
public class 		Member {
				private int id;
				private String name;
				private int borrowedCount;
				private int numViweBorroed;
				private int numBorrows;
				private int numReturns;
				private double sessionFees;
				public double TotalRevenue;
				public int TotalViweBorrowed;
				public int TotalBorrows;
				public int TotalReturns;
				
				

public Member()
{
				id=0;
				name="  ";
				borrowedCount=0;
				numViweBorroed=0;
				numBorrows=0;
				numReturns=0;
				sessionFees=0;
				TotalRevenue=0;
				TotalViweBorrowed=0;
				TotalBorrows=0;
				TotalReturns=0;
}
			public void display(){
							
							System.out.println("name"+name);
							System.out.println("borrowedCount"+borrowedCount);
							System.out.println("numViweBorroed"+numViweBorroed);
							System.out.println("numBorrows"+numBorrows);
							System.out.println("numReturns"+numReturns);
							System.out.println("sessionFees"+sessionFees);
							System.out.println("TotalRevenue"+TotalRevenue);
							System.out.println("TotalViweBorrowed"+TotalViweBorrowed);
							System.out.println("TotalBorrows"+TotalBorrows);
							System.out.println("TotalReturns"+TotalReturns);
							
							
							
							
			}
						
					
}
