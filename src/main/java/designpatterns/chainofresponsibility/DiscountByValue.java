package designpatterns.chainofresponsibility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountByValue implements Discount {
	
	private Discount nextDiscount;

	@Override
	public BigDecimal calcDiscount(Cart cart) {
		if (cart.getTotalValue().compareTo(new BigDecimal(500)) >= 0  ) {
			return cart.getTotalValue().multiply(new BigDecimal(0.08)).setScale(2, RoundingMode.FLOOR);
		}
		return nextDiscount.calcDiscount(cart);
	}

	@Override
	public Discount setNext(Discount next) {
		this.nextDiscount = next;	
		return this.nextDiscount;
	}

}
