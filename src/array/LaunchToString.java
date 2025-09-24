package array;

class Employee{
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		// return "Hello";               //---> Tostring will return Hello
	}
	
}

public class LaunchToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Aksa", 62000);  //It will prin an hash code/address if no toString mehtod written
		System.out.println(emp);
		

	}

}
