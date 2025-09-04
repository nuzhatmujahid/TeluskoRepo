package lambda;

abstract class Phone{
	abstract void connect(); 
}

/*
 * class MyPhone extends Phone{ public void connect() {
 * System.out.println("Connect......."); } }
 */

public class AbstractAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Phone ph = new MyPhone(); ph.connect();
		 */
		
		Phone ph = new Phone(){
			public void connect() {
				System.out.println("Anonymous Connect.......");
			}
		};
		ph.connect();
	}

}
