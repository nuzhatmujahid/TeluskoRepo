package source;
//30th July 2025
public class LaunchApp {

	public static void main(String[] args) {
		System.out.println("First File");
		
		//1 byte
		byte num = 45;  //-128 to 127
		System.out.println("Byte num : "+num);
		
		//2 bytes
		short num2 = 4875;	// -32768 to 32767
		System.out.println("Short num : "+num2);
		
		//4 bytes
		int num3 = 548754;   //-2147483648 to 2147483647
		
		//8 bytes
		long num4 = 548754540664l; 
		
		byte a = 1;
		byte b = 2;
		
		int c = a + b;

		short x = 1;
		short y = 3;
		//  int z = x + y;  // it will work
		//  long z = x + y;    //it will work
	
		
		float f = 2.5f;
		System.out.println("Float num : "+f);
		
		int f1 = 14;
		int f2 = 5;
		float r = f1/f2;
		
		System.out.println("Float num Div : "+r);  //
		

	}

}
