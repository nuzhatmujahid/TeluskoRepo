package source;


class Book{
	private int pageNumber;
	
	void setPageNumber(int pg) {
		if(pg > 0)
			pageNumber = pg;
		else
			System.out.println("Please enter valid number.");
	}
	
	int getPageNumber() {
		return pageNumber;
	}
}

public class LaunchEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setPageNumber(15);
		// System.out.println("pg : "+b.pageNumber);  //As variable is private it is giving compile time error
		System.out.println("Page Number : "+b.getPageNumber());
	}

}
