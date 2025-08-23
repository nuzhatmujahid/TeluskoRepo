package source;

import java.util.Scanner;

class Farmer{
	float pricipleAmt;
	float simpleInterest;
	float loanDuration;
	static float rateOfInterest;
	
	static {
		rateOfInterest = 4.5f;
	}
	
	void farmerInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter required Loan Amount.");
		pricipleAmt = s.nextFloat();
		
		System.out.println("Please enter time to repay loan in months.");
		loanDuration = s.nextFloat();
		
	}
	
	void calculateSimpleInterest() {
		simpleInterest = (pricipleAmt * loanDuration * rateOfInterest) / 100;
	}
	
	void display() {
		System.out.println("Simple Interest : "+simpleInterest);
	}
}

public class LaunchStaticApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");

		Farmer f1 = new Farmer();
		f1.farmerInput();
		f1.calculateSimpleInterest();
		f1.display();
		
		System.out.println("------------------------------------------");
		Farmer f2 = new Farmer();
		f2.farmerInput();
		f2.calculateSimpleInterest();
		f2.display();
		
		System.out.println("------------------------------------------");
		Farmer f3 = new Farmer();
		f3.farmerInput();
		f3.calculateSimpleInterest();
		f3.display();
		
		System.out.println("------------------------------------------");

	}

}
