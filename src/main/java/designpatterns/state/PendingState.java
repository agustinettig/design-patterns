package designpatterns.state;

public class PendingState implements ShippingState {

	@Override
	public void next(Shipping shipping) {
		shipping.setState(new InTransitState()); 
	}

	@Override
	public void previous(Shipping shipping) {
		System.out.println("No ShippingState before Pending.");		
	}

	@Override
	public String description() {
		return "Pending";
	}

}
