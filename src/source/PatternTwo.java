package source;

public class PatternTwo {

	public static void main(String[] args) {
		System.out.println("\n---------- Diagonal line ----------------\n");

		int n = 11;
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		System.out.println("\n---------- Opposite Diagonal line ----------------\n");
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j == n - (i+1))   
					// OR  
				//	if( (i + j)== n-1) 
				{
					System.out.print("* ");
				}  
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		
		System.out.println("\n---------- X Diagonal line ----------------\n");
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i == j) || (i+j == n-1))    
					// OR  
				//	if( (i + j)== n-1) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		
		System.out.println("\n---------- Diamond ----------------\n");
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i+j == (n-1)/2) || (j-i == (n-1)/2) || i + j == (n-1 + (n-1)/2) || i - j == (n-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n---------- 2nd Diamond ----------------\n");
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i+j <= (n-1)/2) || (j-i >= (n-1)/2) || i + j >= (n-1 + (n-1)/2) || i - j >= (n-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n---------- 3rd Diamond ----------------\n");
		int p = 10;
		for(int i=0 ; i<p; i++) {
			for(int j=0; j<p; j++) {
				if(i==0 || j ==0 || i == p-1 || j == p-1 || (i+j == (p-1)/2) || (j-i == (p-1)/2) || i + j == (p-1 + (p-1)/2) || i - j == (p-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\n---------- Triangle ----------------\n");
		int r = 11;
		for(int i=0 ; i<r; i++) {
			for(int j=0; j<r; j++) {
				if( (i + j == ( r - 1)/2) || (j-i == (r-1)/2) || i == (r-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n----------Filled Triangle ----------------\n");
		for(int i=0 ; i<r; i++) {
			for(int j=0; j<r; j++) {
				if( (i + j >= ( r - 1)/2) && (j-i <= (r-1)/2) && i <= (r-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		
		
	}

}
