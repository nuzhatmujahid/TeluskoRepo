package looseCoupling;

public class BlueDart implements IDelivery {

	@Override
	public String deliverProduct(double amount) {
		return "Product Delivered by BlueDart Successfully and Amount paid : "+amount;
	}

}
