package designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public interface Discount {

	BigDecimal calcDiscount(Cart cart);
	Discount setNext(Discount next);

}
