package source;

class Dog{
	//has part
	String name = "";
	double height;
	int cost;
	int age;
	
	//Does Part
	void bark() {
		System.out.println("Dog Barks......");
	}
	void sleep() {
		System.out.println("Dog Sleeps......");
	}
}

public class LaunchOop1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
	}
}
