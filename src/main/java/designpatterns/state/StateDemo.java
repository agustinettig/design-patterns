package designpatterns.state;

public class StateDemo {

	public static void main(String[] args) {
		System.out.println("Creating shipping");
		Shipping shipping = new Shipping();
		System.out.println(shipping.getState().description());
		shipping.previousState();
		shipping.nextState();
		System.out.println(shipping.getState().description());
		System.out.println("Failed attempt to deliver");
		shipping.previousState();
		System.out.println(shipping.getState().description());
		System.out.println("Another attempt to deliver");
		shipping.nextState();
		System.out.println(shipping.getState().description());
		System.out.println("Succesfull attempt to deliver");
		shipping.nextState();
		System.out.println(shipping.getState().description());
		shipping.nextState();
		shipping.previousState();
	}
}
