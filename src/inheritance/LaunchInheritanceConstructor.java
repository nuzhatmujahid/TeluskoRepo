package inheritance;

class Demo1{
	int a,b;
	
	public Demo1(){
		System.out.println("Zero Paramaterized Constr Demo1 ....");
		a = 10;
		b = 20;
	}
	
	public Demo1(int a, int b){
		System.out.println("Paramaterized Constr Demo1....");
		this.a = a;
		this.b = b;
	}
}

class Demo2 extends Demo1{
	int m,n;
	
	public Demo2() {
		System.out.println("Zero Paramaterized Constr Demo2....");
		m = 22;
		n = 26;
	}
	
	public Demo2(int m, int n){
		System.out.println("Paramaterized Constr Demo2....");
		this.m = m;
		this.n = n;
	}
	public void display() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("m : "+m);
		System.out.println("n : "+n);

	}
}


public class LaunchInheritanceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d2 = new Demo2();
		d2.display();

		/*we are not calling const of Demo1 still it gets call not because of inheritance,
		 * as every constr first line is super() which calls the parent constr */
	}

}
