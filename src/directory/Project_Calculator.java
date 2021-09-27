package directory;

import java.util.Scanner;

public class Project_Calculator {

	public static void main ( String [] args ) {
		
	Scanner input = new Scanner(System.in);
	String empname= input.next();
	System.out.println("\"Employee Name\""+" "+empname);
	
	int wages= input.nextInt();
	System.out.println("Employee Hourly Breakdown:"+" "+wages);
	int total= wages+10;
	System.out.println("Employee Total Including bonus:"+" "+total);
	int tax =total-5;	
	System.out.println("Total wages after tax:"+" "+tax);
	int monthlysalary = tax*160;
	System.out.println("Monthly salary:"+" "+monthlysalary);	
	int totalexp= monthlysalary/2;
	System.out.println("Total expenses from salary"+" "+totalexp);		
	
		
		
		
		
		
		
	}
	
	
	
	
}
