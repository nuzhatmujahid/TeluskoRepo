package looseCoupling;

public class FirstFlight implements IDelivery{
	public String deliverProduct(double amount) {
		return "Product Delivered by FirstFlight Successfully and Amount paid : "+amount;
	}
}
