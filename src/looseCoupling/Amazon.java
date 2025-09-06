package looseCoupling;

public class Amazon {
	
	private IDelivery delivery;

	public IDelivery getDelivery() {
		return delivery;
	}

	public void setDelivery(IDelivery delivery) {
		this.delivery = delivery;
	}

	public String productDelivery(double amount) {		
		return delivery.deliverProduct(amount);
	}
}
