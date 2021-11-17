package practice;

import java.util.Scanner;

public class WeeksNDaysCalculation {
	
	public static void calculateWeeksNDays(int noProvided) {
		
		int years=(noProvided/365);
		int weeks=(noProvided%365)/7;
		int days=(noProvided%365)%7;
		
		System.out.println(years+" : "+weeks+" : "+days);
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String input1 = input.next();
		int number=Integer.parseInt(input1);
		
		calculateWeeksNDays(number);

	}

}
