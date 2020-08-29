package designpatterns.strategy;

import java.math.BigDecimal;

public class Order {
	
	private BigDecimal value;

	public Order(BigDecimal value) {
		super();
		this.value = value;
	}

	public void processPayment(PaymentStrategy payment) {
		System.out.println("Processing the payment...");
		payment.pay(this.value);		
	}
}
