package designpatterns.state;

public class DeliveredState implements ShippingState {

	@Override
	public void next(Shipping shipping) {
		System.out.println("No ShippingState after Delivered.");		
	}

	@Override
	public void previous(Shipping shipping) {
		System.out.println("No ShippingState before Delivered."); 
	}

	@Override
	public String description() {
		return "Delivered";
	}

}
