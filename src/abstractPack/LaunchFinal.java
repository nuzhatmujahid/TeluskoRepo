package abstractPack;

final class Human1{
	/// some code
}

class Human{
		public final void cry() {
			System.out.println("Human cry a lot!!");
		}
}

//class Employee extends Human1{
class Employee extends Human{
	/*  Getting Error
	 * public void cry() { System.out.println("Employees more !!");
	 * 
	 * }
	 */ 
}
public class LaunchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Employee();
		human.cry();
	}

}
