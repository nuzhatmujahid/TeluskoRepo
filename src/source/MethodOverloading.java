package source;

class Calculator{
	//multiply whole number, double number, 2 numbers , three numbers
	
	int multiply(int num1 , int num2) {
		return num1*num2;
	}
	int multiply(int num1 , int num2, int num3) {
		return num1*num2*num3;
	}
	double multiply(double num1 , double num2) {
		return num1*num2;
	}
	double multiply(double num1 , double num2, double num3) {
		return num1*num2*num3;
	}
	float multiply(float num1 , float num2) {
		return num1*num2;
	}
	float multiply(float num1 , float num2, float num3) {
		return num1*num2*num3;
	}
	
	void add(int a, double b) {
		System.out.println("Add int + double : "+(a+b));
	}
	
	void add(double a, int b) {
		System.out.println("Add double + int : "+(a+b));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 30;
		double m = 1.2, n = 2.2, p = 3.3;
		float x = 2.9f, y = 6.3f, z = 5.8f;
		
		//Example 1
		Calculator cal = new Calculator();
		System.out.println("Int 2 digit Multiplication : "+cal.multiply(a, b));
		System.out.println("Int 3 digit Multiplication : "+cal.multiply(a, b, c));
		System.out.println("Double 2 digit Multiplication : "+cal.multiply(m, n));
		System.out.println("Double 3 digit Multiplication : "+cal.multiply(m, n, p));
		System.out.println("Float 2 digit Multiplication : "+cal.multiply(x, y));
		System.out.println("Float 3 digit Multiplication : "+cal.multiply(x, y, z));
		
		//Example 2
		 // cal.add(10,20);   // it will give compile time error : The method add(int, double) is ambiguous for the type Calculator
	
		
		//main method overloading
		//MethodOverloading mo = new MethodOverloading();
		main(10);    //As this is static method no need to create object for calling static method
		main("Hello", 25);
	}
	
		//Example 3   //Can we overload main method???? Ans: Yes
		public static void main(int a) {
			System.out.println("\nMain method with 'int' parameter.........");
		}
		public static void main(String s,int a) {
			System.out.println("Main method with 'string and int' parameter.........");
		}
	
	

}
