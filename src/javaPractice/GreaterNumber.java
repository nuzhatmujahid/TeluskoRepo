package javaPractice;

public class GreaterNumber {

	void findGreaterNumber(int n1, int n2, int n3){
		int res;
		if(n1 > n2 && n1 > n3) {
			res = n1;
		}else if(n2 > n1) {
			res = n2;
		}else res = n3;
		
		System.out.println(res+" is greater number.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreaterNumber gn = new GreaterNumber();
		gn.findGreaterNumber(50, 48, 302);
	}

}
