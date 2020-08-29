package designpatterns.strategy;

import java.math.BigDecimal;

public class PayPalPayment implements PaymentStrategy {

	public void pay(BigDecimal value) {
		System.out.println("Paying with PayPal! Value: " + value);
	}

}
