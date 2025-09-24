package array;

public class LaunchForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []name = {"Sameer", "Nuzhat", "Maryam","Ibrahim"};
		
		for(int i = 0;i <name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("=========================================");
		//for each
		for(String s:name) {
			System.out.println(s);
		}

	}

}
