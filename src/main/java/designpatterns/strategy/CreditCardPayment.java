package designpatterns.strategy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {

	public void pay(BigDecimal value) {
		System.out.println("Paying with Credit Card! Value: " + value);
	}

}
