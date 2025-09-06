package tightCoupling;

class python{
	//3. Make method static
	public void buyCourse() {
		System.out.println("Python Course.");
	}
}

//1. Composition
class hbase{
	public void disp() {
		System.out.println("Hbase Course");
		python p = new python();  //Composition means using implementation of 1 class into another class by creation of object
		p.buyCourse();
	}	
}

//2. Inheritance
class db extends python{
	public void disp() {
		System.out.println("Hbase Course");
		buyCourse();
	}	
}


public class LaunchCourse {
	public static void main(String[] args) {
		
	}
}
