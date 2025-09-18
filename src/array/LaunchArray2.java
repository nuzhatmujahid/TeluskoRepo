package array;

import java.util.Scanner;

public class LaunchArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 6;
		int[] marks = new int[cnt];
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("******** Student Marks *******");
		System.out.println("Enter marks for "+cnt+" Students.");
		System.out.println("====================================.");

		for(int i=0;i<cnt;i++) {
			System.out.println("Enter marks for Students : "+i+" = ");
			marks[i] = scan.nextInt();
		}
		
		System.out.println("Entered marks for "+cnt+" Students.");
		System.out.println("====================================.");

		for(int i=0;i<cnt;i++) {
			System.out.println("Marks of Students : "+i+" = "+marks[i]);

		}
	}

}
