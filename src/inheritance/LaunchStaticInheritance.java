package inheritance;
class Parent2{
	public static void eats() {
		System.out.println("Parents eats after child....");
	}
}

class Child2 extends Parent2{
	
	  public static void eats() { 
		  System.out.println("Child don't eat...."); 
		  }
	 
}

public class LaunchStaticInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 child = new Child2();
		child.eats();  //Calling specialised 
		
		Parent2 child1 = new Child2();
		child1.eats();  //calling inherited method
	}

}
