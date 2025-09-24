package array;

import java.util.Scanner;

public class Launch3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] stud = new int[2][2][4];
		Scanner s = new Scanner(System.in);

		// System.out.println("Len : "+stud.length);

		for(int k = 0;k<stud.length;k++) {
			
		  for(int i = 0; i<stud[k].length;i++) {
			  System.out.println("====================================="); 
			  for(int j =0;j<stud[k][i].length;j++) {
				  System.out.println("Enter the marks of Student "+(j+1)+" of class "+(i+1)+" - School - "+(k+1));
				  stud[k][i][j] = s.nextInt(); }
		  }
		}		  
		for(int k = 0;k<stud.length;k++) {

		  for(int i = 0; i<stud[k].length;i++) {
			  System.out.println("****************************************************");
		  
			  for(int j = 0;j<stud[k][i].length;j++) {
				  System.out.println("Marks of Student "+(j+1)+" of class "+(i+1)+"- School - "+(k+1)+" : "+stud[k][i][j]); 
			  } 
		  }
		}
		  
	}

}
