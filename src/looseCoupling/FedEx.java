package looseCoupling;

public class FedEx implements IDelivery{
	public String deliverProduct(double amount) {
		return "Product Delivered by FedEx Successfully and Amount paid : "+amount;
	}
}
