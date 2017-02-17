package unit2;

public class Interest2 {
	public static void main(String args[]){
		
		double principal; 	// The value of the investment.
		double rate; 		// The annual rate of interest.
		double interest; 	// The interest earned during the year.
		
		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble(); // Get the initial investment amount.
		
		System.out.print("Enter the annual interest rate: ");
		rate = TextIO.getDouble(); // Get the annual interest rate.
		
		interest = principal * rate; // Calculate the interest earned in one year.
		principal += interest; // Update principal to include initial investment + interest earned.
		
		System.out.printf("The amount of interest earned in the first year was: $%,1.2f%n", interest );
		System.out.printf("The value of the investment after one year is: $%,1.2f%n", principal);
		
	} // end of main()
} // end of class Interest2

