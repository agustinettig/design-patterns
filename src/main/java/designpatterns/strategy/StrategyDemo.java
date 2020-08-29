package designpatterns.strategy;

import java.math.BigDecimal;

public class StrategyDemo {
	
	public static void main(String[] args) {
		PayPalPayment payPalPayment = new PayPalPayment();
		CreditCardPayment creditCardPayment = new CreditCardPayment();
				
		Order firstOrder = new Order(new BigDecimal(500));
		Order secondOrder = new Order(new BigDecimal(800));
		
		firstOrder.processPayment(payPalPayment);
		secondOrder.processPayment(creditCardPayment);		
	}

}
