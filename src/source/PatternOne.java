package source;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------- Star Squar ----------------");
		int n = 7;
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i== (n-1) || j== (n-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("\n---------- Star A ----------------\n");

		int m = 7;
		for(int i=0 ; i<m; i++) {
			for(int j=0; j<m; j++) {
				if(i==0 || j==0 || j== (m-1) || i == (m-1)/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n---------- Star T ----------------\n");

		int p = 7;
		for(int i=0 ; i<p; i++) {
			for(int j=0; j<p; j++) {
				if(i==0 || j == (p-1)/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		System.out.println("\n---------- Star H ----------------\n");

		int q = 7;
		for(int i=0 ; i<q; i++) {
			for(int j=0; j<q; j++) {
				if(j == 0 || j == q-1 || i == (q-1)/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		System.out.println("\n---------- Star D ----------------\n");

		for(int i=0 ; i<q; i++) {
			for(int j=0; j<q; j++) {
				if(((i == 0 || i == n-1) && j < n-1) || j==0 || (j == n-1 && i > 0 && i<n-1))
				
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		System.out.println("\n---------- Star O ----------------\n");

		int l = 5;
		for(int i=0 ; i<l; i++) {
			for(int j=0; j<l; j++) {
				if(((i==0 || i == l-1) && j>0 && j<l-1)  || ((j == 0 || j == l-1) && i>0 && i<l-1))// || ( i == n-1 && j>0 && j<n-1))
				
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		System.out.println("\n---------- Star Y ----------------\n");

		int l1 = 7;
		for(int i=0 ; i<l1; i++) {
			for(int j=0; j<l1; j++) {
				if(i+j == l1-1 || i == j && i<=(l1-1)/2)
				
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
