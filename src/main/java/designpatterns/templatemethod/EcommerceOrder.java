package designpatterns.templatemethod;

public class EcommerceOrder extends OrderProcessTemplate {
	
	public EcommerceOrder(boolean isGift) {
		super(isGift);
	}

	@Override
	protected void receivePayment() {
		System.out.println("Receiving online payment");		
	}

	@Override
	protected void delivery() {
		System.out.println("Items shipped");		
	}

}