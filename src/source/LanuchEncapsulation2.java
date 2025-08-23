package source;


class Employee{
	private int id;
	private String name;
	private int age;
	
	void setId(int id){
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getId(){
		return id;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}

public class LanuchEncapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("John");
		emp.setAge(40);
		
		System.out.println("Id : "+emp.getId());
		System.out.println("Name : "+emp.getName());
		System.out.println("Age : "+emp.getAge());
	}

}
