package lambda;

class AndroidCall{
	public void call() {
		System.out.println("New UI is very Bad....");
	}
}

class MyAndroidCall extends AndroidCall{
	public void call() {
		System.out.println("My New UI is Better.");
	}	
}

public class AnonymousClass {
	public static void main(String[] args) {
	
		AndroidCall obj = new AndroidCall();
		obj.call();
		
		//Here we are cretaing neww class for 1 object whose implementation is different.
		//Instead of creating new class we can decalre Anonymous class
		
		/*
		 * AndroidCall obj1 = new MyAndroidCall();
		 *  obj1.call();
		 */
		
		AndroidCall obj1 = new AndroidCall() {
			public void call() {
				System.out.println("Annonymous : My New UI is Better.");
			}
		};
		
		obj1.call();
	}
}
