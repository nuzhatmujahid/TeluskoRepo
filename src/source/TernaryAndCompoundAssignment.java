package source;

public class TernaryAndCompoundAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 30;
		
		int res = (a>b) ? (a-b) : (a+b);
		
		System.out.println("Result : "+res);
		
		
		//Compound Assignment Operator
		int n1 = 3;
		System.out.println("Before addition : "+n1);
		
		//n1 *= 2;  // n1 = n1 * 2;
		n1 += 10;   // n1 = n1 + 10;
		System.out.println("After addition : "+n1);
		
	}

}
