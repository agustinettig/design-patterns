package designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class CartItem {

	String name;
	BigDecimal value;
	Integer quantity;

	public CartItem(String name, BigDecimal value, int quantity) {
		super();
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public Integer getQuantity() {
		return quantity;
	}

}
