package designpatterns.state;

public interface ShippingState {

	void next(Shipping shipping);
    void previous(Shipping shipping);
    String description();
}
