package array;

import java.util.Scanner;

public class Launch2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Store data of 5 students of 3 classes
		int[][] stud = new int[3][5];
		Scanner s = new Scanner(System.in);

		// System.out.println("Len : "+stud.length);
		
		  for(int i = 0; i<stud.length;i++) {
			  System.out.println("====================================="); 
			  for(int j =0;j<stud[i].length;j++) {
				  System.out.println("Enter the marks of Student "+(j+1)+" of class "+(i+1));
				  stud[i][j] = s.nextInt(); }
		  }
		  
		  for(int i = 0; i<stud.length;i++) {
			  System.out.println("****************************************************");
		  
			  for(int j = 0;j<stud[i].length;j++) {
				  System.out.println("Marks of Student "+(j+1)+" of class "+(i+1)+" : "+stud[i][j]); 
			  } 
		  }
		  
		  System.out.println("-----------------For each ------------------");

		  for(int[] n : stud) {
			  for(int m : n) {
				  System.out.println("----- "+m);
			  }
			  System.out.println("=================");
			  
		  }
	}

}
