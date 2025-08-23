package inheritance;
class Animal{
	public void eat() {
		System.out.println("Animals Eat!!!!!");
	}
	
	public void sleep() {
		System.out.println("Animals sleep!!!!!!");
	}
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
class Forest{
	public void executes(Animal animal) {
		animal.eat();
		animal.sleep();
		System.out.println("-------------------------------");
		//1 : M    writting once getting many behaviour
	}
}
public class LaunchPolymorphism1 {
	public static void main(String[] args) {
			Lion lion = new Lion();
			Deer deer = new Deer();
			Monkey monk = new Monkey();
			
			lion.eat();
			lion.sleep();
			System.out.println("-------------------------------");
			deer.eat();
			deer.sleep();
			System.out.println("-------------------------------");
			monk.eat();
			monk.sleep();
			System.out.println("********************************");
			
			Forest forest = new Forest();
			forest.executes(lion);
			forest.executes(deer);
			forest.executes(monk);
			
	}
}
