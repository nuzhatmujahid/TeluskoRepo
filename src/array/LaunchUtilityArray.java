package array;

import java.util.Arrays;

public class LaunchUtilityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[2];
		
		String name = a.getClass().getName();
		System.out.println("Name of class : "+name);   //o/p --->  Name of class : [I
		
		int b[][] = new int[2][3];
		
		String name2 = b.getClass().getName();
		System.out.println("Name of class : "+name2);   //o/p --->  Name of class : [[I

		int []arr = {55,78,14,98};
		
		
		for(int num : arr)
			System.out.print(num+" ");
		Arrays.sort(arr);
		
		System.out.println("\n---------After sort");
		for(int num : arr)
			System.out.print(num+" ");
	}

}
