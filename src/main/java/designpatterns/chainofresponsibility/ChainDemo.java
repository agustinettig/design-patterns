package designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class ChainDemo {
	
	public static void main(String[] args) {
		DiscountByValue discountByValue = new DiscountByValue();
		DiscountByFiveItems discountByFiveItems = new DiscountByFiveItems();
		DefaultDiscount defaultDiscount = new DefaultDiscount();
		
		discountByValue.setNext(discountByFiveItems).setNext(defaultDiscount);
		
		Cart cart = new Cart();
		cart.addItem(new CartItem("Item 1", new BigDecimal(10), 1));
		cart.addItem(new CartItem("Item 2", new BigDecimal(10), 1));
		cart.addItem(new CartItem("Item 3", new BigDecimal(20), 1));
		cart.addItem(new CartItem("Item 4", new BigDecimal(30), 2));
		
		System.out.println("Calculation discount for " + cart.getTotalItems() + " items cart with value " + cart.getTotalValue());		
		BigDecimal discountValue = discountByValue.calcDiscount(cart);
		System.out.println("Discount value: " + discountValue);
		
		cart.addItem(new CartItem("Item 5", new BigDecimal(900), 1));
		System.out.println("Calculation discount for " + cart.getTotalItems() + " items cart with value " + cart.getTotalValue());
		discountValue = discountByValue.calcDiscount(cart);
		System.out.println("Discount value: " + discountValue);
	}

}
