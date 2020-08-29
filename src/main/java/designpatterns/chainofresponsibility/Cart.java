package designpatterns.chainofresponsibility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<CartItem> items;

	public Cart() {
		this.items = new ArrayList<CartItem>();
	}

	public void addItem(CartItem item) {
		this.items.add(item);
	}

	public BigDecimal getTotalValue() {
		return this.items.stream()
				.map(item -> item.getValue().multiply(new BigDecimal(item.getQuantity())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public Integer getTotalItems() {
		return this.items.stream()
				.map(CartItem::getQuantity)
				.reduce(0, Integer::sum);
	}
}
