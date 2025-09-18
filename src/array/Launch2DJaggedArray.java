package array;

import java.util.Scanner;

public class Launch2DJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Store data of 5 students of 3 classes
		int[][] stud = new int[3][];
		stud[0] = new int[3];
		stud[1] = new int[5];
		stud[2] = new int[4];
		
		Scanner s = new Scanner(System.in);
		
		
		for(int i = 0; i<stud.length;i++) {
		  System.out.println("====================================="); 
		  for(int j =0;j<stud[i].length;j++) {
			  System.out.println("Enter the marks of Student "+(j+1)+" of class "+(i+1));
			  stud[i][j] = s.nextInt(); 
			  }
		  }
		  
		  for(int i = 0; i<stud.length;i++) {
			  System.out.println("****************************************************");
		  
			  for(int j = 0;j<stud[i].length;j++) {
				  System.out.println("Marks of Student "+(j+1)+" of class "+(i+1)+" : "+stud[i][j]); 
			  } 
		  }
		 
	}

}
