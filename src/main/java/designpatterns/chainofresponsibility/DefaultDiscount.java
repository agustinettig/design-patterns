package designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class DefaultDiscount implements Discount {
	
	@Override
	public BigDecimal calcDiscount(Cart cart) {
		return BigDecimal.ZERO;
	}

	@Override
	public Discount setNext(Discount next) {
		return null;
	}

}
