package stringPack;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";

		
		System.out.println("Direct Literal assignment : comapre with '==' : "+(str1 == str2));
		System.out.println("Direct Literal assignment : compare with equals : "+(str1.equals(str2)));
		
		System.out.println("-------------------------------------------------------------------");

		String str5 = "java";
		System.out.println("\nDirect Literal assignment : comapre with '==' case sentive check : "+(str1 == str5));
		System.out.println("Direct Literal assignment : comapre with 'equal' case sentive check : "+(str1.equals(str5)));
		System.out.println("Direct Literal assignment : compare with equals : "+(str1.equalsIgnoreCase(str5)));


		
		System.out.println("-------------------------------------------------------------------");
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		System.out.println("Using new String : comapre with '==' :"+(str3 == str4));
		System.out.println("Using new String : compare with equals : "+(str3.equals(str4)));

		System.out.println("-------------------------------------------------------------------");

		System.out.println("Length : "+str3.length());
	}
}
