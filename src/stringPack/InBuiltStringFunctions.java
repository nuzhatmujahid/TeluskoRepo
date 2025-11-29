package stringPack;

public class InBuiltStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloHowAreYou";
		System.out.println("Length : "+str.length());
		System.out.println("Upper Case : "+str.toUpperCase());
		System.out.println("Lower Case : "+str.toLowerCase());
		System.out.println("SubString : "+str.substring(0, 8));
		System.out.println("Char at : "+str.charAt(8));
		System.out.println("Start with : "+str.startsWith("Hell"));
		System.out.println("Ends with : "+str.endsWith("You"));
		System.out.println("Index of (first occuarance): "+str.indexOf("H"));
		System.out.println("Last Index (Last index): "+str.lastIndexOf("H"));
		
		char []ch = str.toCharArray();
		for(char c : ch) {
			System.out.print(c+" ");
		}



	}

}
