package stringPack;

public class LaunchString2 {
	public static void main(String[] args) {
		String str = "Python";
		
		System.out.println("str : "+str);
		str = str + " Course";
		System.out.println("str : "+str);
		
		System.out.println("----------------------------------------");
		
		String s1 = "Hello World";
		String s2 = "Hello"+" World";   //Memory in String Constant pool
		
		System.out.println("In SCP : "+(s1==s2));
		
		System.out.println("----------------------------------------");
		
		String s3 = "Hello World";
		String s4 = s3+" World";  //Memory in Heap Area
		
		System.out.println("In SCP : "+(s3==s4));
		
		String s5 = "Hello";
		String s6 = "World";
		
		String s7 = s5 + s6;
		String s8 = s5 + s6;
		System.out.println(s7+" ---- "+s8);
		System.out.println("string without new keyword still in heap area : in SCP : "+(s7==s8));

		System.out.println("----------------------------------------");

		String s11 = "Welcome ";
		String s12 = "To Java Class";
		String s13 = s11.concat(s12);
		System.out.println("Concate : "+s13);
		
		String s21 = "Hello ".concat("World!!");
		String s22 = "Hello ".concat("World!!");
		System.out.println("----------------------------------------");

		System.out.println("concat : In SCP : "+(s21==s22));
				
	}
}
