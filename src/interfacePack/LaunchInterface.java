package interfacePack;

interface Calc{
	void add(int n1, int n2);
	int mul(int n1, int n2);
	
	default void defaultMethod() {
		System.out.println("Default method in Calc");
		privateMethod();

	}
	
	static void staticMethod() {
		System.out.println("Static method in Calc");	
		
	}
	
	private void privateMethod() {
		System.out.println("Private method in Calc");	
	}
	
}

interface Calc2{
	void divide(int n1, int n2);
}

interface Calc3 extends Calc{
	void show();
}

class myCalc implements Calc, Calc2{
	public void add(int a, int b) {
		System.out.println("Addition in myCal class : " +(a + b));
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public void divide(int a, int b) {
		System.out.println("Div in my class class : "+(a/b));
	}
}

class myCalc1 implements Calc{
	public void add(int a, int b) {
		System.out.println("Addition in myCal1 class : " +(a + b));		
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
}

class Parent{
	void printAll() {
		System.out.println("I will print everything..........");
	}
}

class Child extends Parent implements Calc3{

	@Override
	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class LaunchInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCalc c1 = new myCalc();
		c1.add(10, 2);
		System.out.println("Multiplication in myCalc class : "+c1.mul(5, 6));
		c1.divide(25, 5);
		c1.defaultMethod();
		Calc.staticMethod();
		
		System.out.println("\n---------------------------------------------------\n");
		Calc c2 = new myCalc1();
		c2.add(2, 25);
		System.out.println("Multiplication in myCalc class : "+c2.mul(2, 7));
	}

}
