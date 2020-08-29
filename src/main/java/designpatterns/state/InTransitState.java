package designpatterns.state;

public class InTransitState implements ShippingState {

	@Override
	public void next(Shipping shipping) {
		shipping.setState(new DeliveredState()); 
	}

	@Override
	public void previous(Shipping shipping) {
		shipping.setState(new PendingState()); 		
	}

	@Override
	public String description() {
		return "In transit";
	}

}