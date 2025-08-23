package source;

class Student{
	private int id;
	private String name;
	private int age;
	
	void setId(int id) {
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}

public class LaunchEncaplsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setId(101);
		st.setName("Rohan");
		st.setAge(12);

		
		System.out.println("Student Id : "+st.getId());
		System.out.println("Student Name : "+st.getName());
		System.out.println("Student Age : "+st.getAge());
		
		
		System.out.println("\n=============================================\n");
		
		Student st1 = new Student();
		st1.setId(102);
		st1.setName("Junkook");
		st1.setAge(23);

		
		System.out.println("2nd Student Id : "+st1.getId());
		System.out.println("2nd Student Name : "+st1.getName());
		System.out.println("2nd Student Age : "+st1.getAge());
	}

}
