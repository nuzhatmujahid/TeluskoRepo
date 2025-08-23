package source;

class Student2{
	private int id;
	private String name;
	private int age;
	
	Student2(){
		System.out.println("in defal");
	}
	Student2(int id, String name, int age) {
		this();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
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


public class LaunchConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st = new Student2(1, "Akash", 16);
		System.out.println("Constructor - Id :  "+st.getId());
		System.out.println("Constructor - Name :  "+st.getName());
		System.out.println("Constructor - Age :  "+st.getAge());
		
	}

}
