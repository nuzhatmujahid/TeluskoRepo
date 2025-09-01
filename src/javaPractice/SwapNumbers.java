package javaPractice;


//Swap numbers without using 3rd variable
public class SwapNumbers {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("***************** Before Swwaping *******************");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("***************** After Swwaping *******************");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}
