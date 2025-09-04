package lambda;

interface Phone1{
	void connect();
}

interface Calculator{
	int add(int a, int b);
}

public class AnonymousInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone1 ph = new Phone1(){
			public void connect() {
				System.out.println("Interface Annymous class");
			}
		};
		ph.connect();
		
		
		//Annonymous object
		new Phone1(){
			public void connect() {
				System.out.println("Interface Annymous object");
			}
		}.connect();
		
		Phone1 p2 = () -> {
			System.out.println("Lambda Expression");
		};
		p2.connect();
		
		Calculator cal = (n , m) -> n+m;
		int c = cal.add(5, 6);
		System.out.println("Addition : Lamba : "+c);
	}

}
