
package source;

class Demo1{
	//Sttsic Variables
	static int a,b;
	
	//Instance Variable
	int m,n;
	
	//Static Block
	static {
		System.out.println("Inside Static Block!!!!");
	}
	
	//Non Static block
	{
		System.out.println("Inside Non Static Block!!!!");

	}
	
	//Constructor
	Demo1(){
		System.out.println("Insid Constructor!!!!!!");
		a = 10;
		b = 20; 
		m = 30;
		n = 40;
	}
	
	//Method (instance method)
	void show() {

		System.out.println("Inside Show ************");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("m : "+m);
		System.out.println("n : "+n);
	}
	
	//Static Method
	static void display() {
		System.out.println("Inside Display ************");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		//Compile time error Error Inside static block we can not access non static variable
		/*System.out.println("m : "+m);
		System.out.println("n : "+n);*/
	}
}


public class LaunchStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside main method");
		System.out.println("Static block did not executed as Demo1 is not loaded, \nwe have not created object of Demo1 class nor calling static method of Demo1 class with the help of className.");
		/*
		 * Demo1 d = new Demo1(); d.show(); Demo.display(); d.display();
		 */
	}

}

