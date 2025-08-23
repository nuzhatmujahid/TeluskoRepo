package source;

class Telusko{
	int age;
	String course;
	static int count;
	
	
	/*We added count++ in every constructor,
	 * 	if by mistake in any constructor we forgot to add count++ then we will not get correct object count
	 * so that solution is add count++ in non static block(Java initialization block), that will result in increasing count on every constructor call
	 * 
	 */
	
	{
		count++;	
	}
	
	Telusko(){
		age =10;
		course = "Java, Dev OPS, AWS";
		//count++;
	}
	
	Telusko(int age){
		this.age = age;
		course = "Java";
		//count++;

	}
	
	Telusko(int age , String course){
		this.age = age;
		this.course = course;
		//count++;

	}
	
	void display() {
		System.out.println("Age : "+this.age);
		System.out.println("Course : "+this.course);
	}
	
}
public class LaunchStaticObjectCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telusko t1 = new Telusko();
		Telusko t2 = new Telusko(10);
		Telusko t3 = new Telusko(10, "Python");
		Telusko t4 = new Telusko();
		
		System.out.println("Number of Object : "+Telusko.count);
	}

}
