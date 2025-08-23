package inheritance;

class Plane{
	void takeOff() {
		System.out.println("Plane : Take Off!!!!");
	}
	
	void fly() {
		System.out.println("Plane : Fly!!!!");
	}
}

class PassengerPlane extends Plane{
	void fly() {
		System.out.println("PassengerPlane : Fly!!!!");
	}
	
	void landing() {
		System.out.println("PassengerPlane : Landing!!!!");
	}
}

public class LaunchInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassengerPlane parent = new PassengerPlane();
		parent.takeOff();    // Inherited method
		parent.fly(); 		 // Overridden method
		((PassengerPlane) parent).landing();    // Specialised method
	}

}
