package source;

public class MyNameStar {

	public static void main(String[] args) {
		int n = 7;
		int n2 = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || j==n2|| i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0; j<n; j++) {
				if(j==0 || j==n2|| i==n2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0; j<n; j++) {
				if(i==0 || i==n2 || i+j ==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0; j<n; j++) {
				if(j==0 || j==n2 || i == n2/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || j== n2 || i == n2/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0; j<n; j++) {
				if(i==0 || j==n2/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
