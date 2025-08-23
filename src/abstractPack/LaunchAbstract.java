package abstractPack;


abstract class  Animal{
	abstract public void eat();
	abstract public void sleep();
}

class Lion extends Animal{
	public void eat() {
		System.out.println("Lion hunts and Eat!!!!!");
	}
	
	public void sleep() {
		System.out.println("Lion roars and sleep!!!!!!");
	}
}

class Deer extends Animal{
	public void eat() {
		System.out.println("Deer grazes Eat!!!!!");
	}
	
	public void sleep() {
		System.out.println("Deer sleeps Less!!!!!!");
	}
}

class Monkey extends Animal{
	public void eat() {
		System.out.println("Monkey steals and Eat!!!!!");
	}
	
	public void sleep() {
		System.out.println("Monkey sleep like Human!!!!!!");
	}
}




public class LaunchAbstract {
		public static void main(String[] args) {
			
		}
}
