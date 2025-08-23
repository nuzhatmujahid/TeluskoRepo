package source;

public class LaunchAppTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 5;
		int b;
		b = a;
		System.out.println("Implicit : Converted val byte to int: "+b);

		int n1 = 45;
		double n2;	
		n2 = n1;
		System.out.println("Implicit : Converted val int to double: "+n2);


		double x = 45.5;
		int y;
		y = (int)x;	
		System.out.println("Explicit : Converted val double to int: "+y);
		
		System.out.println("\n *******************Pre and Post Increment********************* \n");


		int num1 = 5;
		int num2;
		System.out.println("Before Increment : num1 = "+num1);

		num2 = num1++;
		
		System.out.println("Post Increment : num1 = "+num1+"  And num2 = "+num2);
		
		int num3 = ++num1;
		System.out.println("Pre Increment : num1 = "+num1+"  And num3 = "+num3);


		System.out.println("\n *******************Pre and Post Decrement********************* \n");


		int num11 = 5;
		int num21;
		System.out.println("Before Decrement : num11 = "+num11);

		num21 = num11--;
		
		System.out.println("Post Decrement : num11 = "+num11+"  And num21 = "+num21);
		
		int num31 = --num11;
		System.out.println("Pre Decrement : num11 = "+num11+"  And num31 = "+num31);

		
		int n3 = 5;
		int n4 = n3++  + ++n3 + ++n3 +n3++ - n3--;
		//5 + 7 + 8 + 8 - 9                   //n3 = 8
		System.out.println("\n n3: "+n3+"  ---- operation : n4 : "+n4);

		
	}

}
