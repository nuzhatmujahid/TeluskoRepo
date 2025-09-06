package looseCoupling;

public class LanchDeliveryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon am = new Amazon();
		
		am.setDelivery(new FirstFlight());
		System.out.println(am.productDelivery(500));
	}

}
