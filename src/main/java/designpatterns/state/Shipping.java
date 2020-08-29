package designpatterns.state;

public class Shipping {

	protected ShippingState state;

	public Shipping() {
		this.state = new PendingState();
	}
	
	protected void setState(ShippingState state) {
		this.state = state;
	}
	
	public ShippingState getState() {
		return this.state;
	}
	
	public void nextState() {
		this.state.next(this);
	}
	
	public void previousState() {
		this.state.previous(this);
	}
	
}
