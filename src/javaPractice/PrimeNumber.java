package javaPractice;

import java.util.Scanner;

public class PrimeNumber {

	int acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int num = s.nextInt();
		
		if(num <= 0) {
			System.out.println("Enter +ve Number");
			acceptInput();
		}
		
		
		return num;
	}
	boolean checkForPrime(int num){
	//	System.out.println("Entered Number is : "+num);
		
		if(num == 1) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		for(int i = 2 ;i <num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PrimeNumber pn = new PrimeNumber(); int n1 = pn.acceptInput(); boolean flag =
		 * pn.checkForPrime(n1); if(flag == true) {
		 * System.out.println(n1+" is a Prime Number."); }else {
		 * System.out.println(n1+" is not a Prime Number."); }
		 */
		
		
		        // Declaring and initializing integer variable
		        // to be checked
		        int n = 37;

		        // Condition check
		        // if n|1 if greater than n then this number is even
		        if ((n | 1) > n) {

		            // Print statement
		            System.out.println("Number is Even");
		        }
		        else {

		            // Print statement
		            System.out.println("Number is Odd");
		        }
	}

}
