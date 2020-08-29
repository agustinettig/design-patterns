package designpatterns.templatemethod;

public class StoreOrder extends OrderProcessTemplate {
	
	public StoreOrder(boolean isGift) {
		super(isGift);
	}

	@Override
	protected void receivePayment() {
		System.out.println("Receiving payment at the counter");		
	}

	@Override
	protected void delivery() {
		System.out.println("Items delivered at the counter");		
	}

}
